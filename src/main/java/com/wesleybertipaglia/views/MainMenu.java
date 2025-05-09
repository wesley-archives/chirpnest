package com.wesleybertipaglia.views;

import com.wesleybertipaglia.controllers.PostController;

import java.util.Scanner;

public class MainMenu {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PostController postController = new PostController();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();
            handleChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("🐦 CHIRPNEST POST MENU");
        System.out.println("\n-------------------------------------");
        System.out.println("1. List all posts");
        System.out.println("2. View post details");
        System.out.println("3. Create a new post");
        System.out.println("4. Update a post");
        System.out.println("5. Delete a post");
        System.out.println("0. Exit");
        System.out.print("\nChoose an option: ");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1" -> postController.list();
            case "2" -> postController.getDetails();
            case "3" -> postController.createPost();
            case "4" -> postController.updatePost();
            case "5" -> postController.deletePost();
            case "0" -> exitProgram();
            default -> System.out.println("\n⚠️ Invalid option. Please try again.");
        }
    }

    private static void exitProgram() {
        System.out.println("\n👋 Exiting... Goodbye!");
        scanner.close();
        System.exit(0);
    }
}
