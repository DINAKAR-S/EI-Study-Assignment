package main;

import controller.ScheduleManager;
import utils.LoggerUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input;

        LoggerUtil.logInfo("Astronaut Daily Schedule Organizer Started");

        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. View Tasks\n4. Mark Task as Completed\n5. Exit");
            System.out.print("Enter choice: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:MM): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:MM): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority (HIGH, MEDIUM, LOW): ");
                    String priority = scanner.nextLine();
                    manager.addTask(description, startTime, endTime, priority);
                    break;

                case "2":
                    System.out.print("Enter task description to remove: ");
                    String taskToRemove = scanner.nextLine();
                    manager.removeTask(taskToRemove);
                    break;

                case "3":
                    manager.viewTasks();
                    break;

                case "4":
                    System.out.print("Enter task description to mark as completed: ");
                    String taskToComplete = scanner.nextLine();
                    manager.markTaskAsCompleted(taskToComplete);
                    break;

                case "5":
                    LoggerUtil.logInfo("Exiting Astronaut Daily Schedule Organizer");
                    scanner.close();
                    System.exit(0);

                default:
                    LoggerUtil.logError("Invalid choice. Please try again.");
            }
        }
    }
}
