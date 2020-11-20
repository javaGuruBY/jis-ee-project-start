package by.jrr.srp.view;

import by.jrr.srp.bean.MenuChoice;
import by.jrr.srp.bean.Task;

import java.util.Scanner;

public class Menu {

    public static MenuChoice printMainMenu() {
        System.out.println("1. Create task");
        System.out.println("2. Find task by id");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        return MenuChoice.getByOrdinal(scanner.nextInt());
    }

    public static String[] getTaskDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        String[] responce = {name, description};
        return responce;
    }

    public static long getTaskIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task id: ");
        return scanner.nextLong();
    }

    public static void printTaskDetails(Task task) {
        System.out.println(task);
    }

    public static void printErrorMessage(Exception e) {
        System.out.println(e.getMessage());
    }
}
