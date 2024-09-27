package model;

import java.util.List;

public class TaskConflictObserver {
    public boolean checkConflict(Task newTask, List<Task> existingTasks) {
        for (Task task : existingTasks) {
            if (isTimeOverlap(newTask.getStartTime(), newTask.getEndTime(), task.getStartTime(), task.getEndTime())) {
                System.out.println("Error: Task conflicts with existing task \"" + task.getDescription() + "\".");
                return true;
            }
        }
        return false;
    }

    private boolean isTimeOverlap(String newStart, String newEnd, String existingStart, String existingEnd) {
        return (newStart.compareTo(existingEnd) < 0 && newEnd.compareTo(existingStart) > 0);
    }
}
