package at.cihan.projects.strings;

import java.util.Scanner;

public class stringHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("1. Palindrome");
            System.out.println("2. Count letters");
            System.out.println("3. Reverse String");
            System.out.println("4. Print amount of letters");
            System.out.println("5. Exit");
            int selection = scanner.nextInt();
        }
    }
}
