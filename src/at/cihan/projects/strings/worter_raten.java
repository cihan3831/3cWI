package at.cihan.projects.strings;

import java.util.Random;
import java.util.Scanner;

public class worter_raten {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] words = {"Leo Messi"};
        int randomNum = random.nextInt(words.length);
        String word = words[randomNum].toLowerCase();

        char[] wordArr = word.toCharArray();
        char[] guessedArr = new char[wordArr.length];

        for (int i = 0; i < guessedArr.length; i++) {
            guessedArr[i] = '*';
        }

        boolean isFinished = false;
        System.out.println("Willkommen zum Wörter Raten-Spiel!");




    }
}
