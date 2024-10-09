import java.util.Random;
import java.util.Scanner;

public class würfelspiel {
    public static void main(String[] args) {
        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.

        Random random = new Random();
        int randomNumber = random.nextInt(6);
        Scanner scanner = new Scanner(System.in);

        int spielerPunkte = 0;
        int computerPunkte = 0;

        System.out.println("Willkommen im Würfelspiel");
        System.out.println("Drücke 'Enter', um 6 mal zu Würfeln und gegen den Computer zu spielen!");
        scanner.nextLine();
        for (int i = 0; i < 6; i++) {
            int spielerWurf = random.nextInt(6) + 1;
            spielerPunkte = spielerPunkte + spielerWurf;
            System.out.println("Du hast eine " + spielerWurf + "gewürfelt.");
        }
        System.out.println("Dein Gesamtergebnis beträgt: " + spielerPunkte);

        System.out.println("Computer ist dran!");
        for (int i = 0; i < 6; i++) {
            int computerWurf = random.nextInt(6) + 1;
            computerPunkte = computerPunkte + computerWurf;
            System.out.println("Der Computer hat eine " + computerWurf + "gewürfelt.");
        }
        System.out.println("Das Gesamtergebnis vom Computer beträgt: " + computerPunkte);

        if (spielerPunkte > computerPunkte) {
            System.out.println("Du hast Gewonnen. Glückwunsch!");
        }
        else if (spielerPunkte < computerPunkte) {
            System.out.println("Der Computer hat gewonnen. Versuchen sie es noch einmal.");
        }
    }
}
