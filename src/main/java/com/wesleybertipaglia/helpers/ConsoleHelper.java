package com.wesleybertipaglia.helpers;

public class ConsoleHelper {

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing console: " + e.getMessage());
        }
    }

    public static void printHeader(String title) {
        var padding = " ".repeat((40 - title.length()) / 2);
        System.out.println("\n" + "-".repeat(40));
        System.out.println(padding + title.toUpperCase() + padding);
        System.out.println("-".repeat(40) + "\n");
    }
}
