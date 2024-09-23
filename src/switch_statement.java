import java.util.Random;

public class switch_statement {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5, 10);
        switch (randomNumber){
            // Wenn der Wert 10 ist gib aus Ten
            case 10:
                System.out.println("Ten");


            // Wenn der Wert 9 ist gib aus Nine
            case 9:
                System.out.println("Nine");


            // Wenn der Wert 8 ist gib aus Eight
            case 8:
                System.out.println("Eight");


            case 7:
                System.out.println("Seven");

            case 6:
                System.out.println("Six");

            case 5:
                System.out.println("Five");
                break;
        }
    }
}
