import java.util.Random;
import java.util.Scanner;

public class würfelspiel {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;


        while (!isFinished) {
            System.out.println("Herzlich Willkommen im Würfelspiel!");
            System.out.println("1: Würfelspiel Starten.");
            System.out.println("2: Würfelspiel Beenden.");

            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {
                int spielerPunkte = 0;
                int computerPunkte = 0;

                    for (int i = 0; i < 6; i++) {
                        System.out.println("Drücken sie Enter zum Würfeln!");
                        scanner.nextLine();
                        int spielerWurf = random.nextInt(6) + 1;
                        spielerPunkte = spielerPunkte + spielerWurf;
                        System.out.println(spielerPunkte);
                        System.out.println("Du hast eine " + spielerWurf + " gewürfelt.");
                    }
                    System.out.println("Dein Gesamtergebnis beträgt: " + spielerPunkte);
                    
                    for (int i = 0; i < 6; i++) {
                        int computerWurf = random.nextInt(6) + 1;
                        computerPunkte = computerPunkte + computerWurf;
                        System.out.println("Der Computer hat eine " + computerWurf + " gewürfelt.");
                    }

                    System.out.println("Das Gesamtergebnis vom Computer beträgt: " + computerPunkte);


                    if (spielerPunkte > computerPunkte) {
                        System.out.println("Du hast Gewonnen. Glückwunsch!");
                    } else if (spielerPunkte < computerPunkte) {
                        System.out.println("Der Computer hat gewonnen. Versuchen sie es noch einmal.");
                    } else {
                        System.out.println("Das Spiel geht Unentschieden aus. Leider gibt es keinen Gewinner.");
                    }
                }

            else if (selection == 2) {
                isFinished = true;
                System.out.println("Das Spiel wurde beendet.");
            }
        }
    }
}