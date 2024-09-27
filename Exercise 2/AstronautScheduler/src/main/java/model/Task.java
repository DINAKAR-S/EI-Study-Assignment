package model;

public class Task {
    private String description;
    private String startTime;
    private String endTime;
    private Priority priority;
    private boolean isCompleted;

    public Task(String description, String startTime, String endTime, Priority priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.isCompleted = false;
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markComplete() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s [%s] %s",
                startTime, endTime, description, priority, isCompleted ? "[Completed]" : "");
    }
}
