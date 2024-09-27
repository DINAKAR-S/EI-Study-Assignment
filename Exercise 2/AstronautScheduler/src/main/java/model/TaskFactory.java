package model;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priorityInput) {
        Priority priority;
        try {
            priority = Priority.valueOf(priorityInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid priority. Choose from HIGH, MEDIUM, LOW.");
        }
        return new Task(description, startTime, endTime, priority);
    }
}
