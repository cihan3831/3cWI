package at.cihan.projects.strings;

import java.util.Random;
import java.util.Scanner;

public class worter_raten {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"Ronaldo"};
        int randomNum = random.nextInt(words.length);
        String word = words[randomNum].toLowerCase();

        char[] wordArr = word.toCharArray();
        char[] guessedArr = new char[wordArr.length];

        for (int i = 0; i < guessedArr.length; i++) {
            guessedArr[i] = '*';
        }

        boolean isFinished = false;
        System.out.println("Willkommen zum Wörter Raten-Spiel!");

        while (!isFinished) {
            printArray(guessedArr);


            System.out.println("Raten Sie, welche Buchstabe im Wort stecken könnte.");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordArr.length; i++) {
                if (wordArr[i] == guess) {
                    guessedArr[i] = guess;
                    found = true;
                }
            }
            if (found) {
                System.out.println("Richtig! Der Buchstabe " + guess + "ist im Wort.");
            } else {
                System.out.println("Leider Falsch! Der Buchstabe " + guess + "ist nicht im Wort.");
            }

            isFinished = isWordGuessed(guessedArr);
            if (isFinished) {
                System.out.println("Well done! Sie haben gewonnen: " + word);
            }
        }

    }


    private static boolean isWordGuessed(char[] guessedArr) {
        for (char c : guessedArr) {
            if (c == '*') {
                return false;
            }
        }
        return true;
    }


    private static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }
}



