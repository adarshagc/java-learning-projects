//Java Project 1: To-Do List 

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {

            System.out.print("-------------------------");
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("-------------------------");

            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("---------------------------");
            System.out.print("Choose an option (1 - 4): ");

            choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("---------------------------");

            switch(choice) {
                case 1:
                    if(tasks.isEmpty()) {
                        System.out.println("No tasks yet");
                    }else {
                        for(int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added");
                    break;
                case 3:
                    if(tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    }else {
                        for(int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.println("Enter the task number to delete: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if(index > 0 && index <= tasks.size()) {
                            String removed = tasks.remove(index - 1);
                            System.out.println("Deleted: " + removed);
                        }else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        while (choice != 4);
                scanner.close();
    }
}