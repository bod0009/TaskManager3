package main;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<String> tasks;
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public ArrayList<String> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String taskToAdd = scanner.nextLine();
                    taskManager.addTask(taskToAdd);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    if (taskManager.getTasks().contains(taskToRemove)) {
                        taskManager.removeTask(taskToRemove);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Task not found!");
                    }
                    break;

                case 3:
                    taskManager.displayTasks();
                    break;

                case 0:
                    System.out.println("Exiting Task Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}