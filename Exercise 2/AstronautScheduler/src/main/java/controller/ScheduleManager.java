package controller;

import model.Task;
import model.TaskFactory;
import model.TaskConflictObserver;
import utils.LoggerUtil;
import utils.TimeValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private TaskConflictObserver conflictObserver;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        conflictObserver = new TaskConflictObserver();
    }

    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(String description, String startTime, String endTime, String priority) {
        try {
            TimeValidator.validateTime(startTime);
            TimeValidator.validateTime(endTime);

            Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);

            if (!conflictObserver.checkConflict(newTask, tasks)) {
                tasks.add(newTask);
                LoggerUtil.logInfo("Task added successfully: " + description);
            }
        } catch (IllegalArgumentException e) {
            LoggerUtil.logError("Error: " + e.getMessage());
        }
    }

    public void removeTask(String description) {
        Task taskToRemove = findTaskByDescription(description);
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            LoggerUtil.logInfo("Task removed successfully: " + description);
        } else {
            LoggerUtil.logError("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            LoggerUtil.logInfo("No tasks scheduled for the day.");
            return;
        }
        Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markTaskAsCompleted(String description) {
        Task task = findTaskByDescription(description);
        if (task != null) {
            task.markComplete();
            LoggerUtil.logInfo("Task marked as completed: " + description);
        } else {
            LoggerUtil.logError("Error: Task not found.");
        }
    }

    private Task findTaskByDescription(String description) {
        return tasks.stream()
                .filter(task -> task.getDescription().equals(description))
                .findFirst()
                .orElse(null);
    }
}
