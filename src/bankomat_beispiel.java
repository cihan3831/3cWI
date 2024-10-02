import java.util.Scanner;

public class bankomat_beispiel {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Einzahlen");
        System.out.println("2. Auszahlen");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        int selection = scanner.nextInt();

        switch(selection) {
            case 1:
                System.out.println("Betrag zum Einzahlen: ");
                int einzahlen = scanner.nextInt();
        }
    }
}
