import java.util.Scanner;

public class bankomat_beispiel {
    public static void main(String[] args) {

        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        int kontostand = 0;
        boolean isFinished = false;

        while (!isFinished) {

            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel € möchten Sie einzahlen?");

                if (scanner.hasNextInt()) {
                    int einzahlen = scanner.nextInt();
                    kontostand = kontostand + einzahlen;
                    System.out.println(einzahlen + "€ wurde erfolgreich eingezahlt!");

                } else {
                    System.out.println("Einzahlung abgelehnt.");
                    scanner.next();
                }
            }
            if (selection == 2) {
                System.out.println("Wie viel € möchten sie abheben?");
                int abheben = scanner.nextInt();
                kontostand = kontostand - abheben;
                System.out.println(abheben + "€ wurde erfolgreich abgehoben!");
            }

            if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt " + kontostand + "€.");
            }

            if (selection == 4) {
                System.out.println("Vorgang beendet, bitte Karte entnehmen.");
            }
        }
    }
}
