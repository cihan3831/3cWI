package at.cihan.projects.objektorientierung.Rechner;

public class main {
    public static void main(String[] args) {
        basics basicCalculator = new basics();
        System.out.println("Addition + : " + basicCalculator.add(10,5.5));
        System.out.println("Subtraktion - : " + basicCalculator.sub(20,17));

        scientific scientificCalculator = new scientific();
        int result2 = scientificCalculator.sinus(9);
        System.out.println("Sinus : " + result2);

        root root = new root();
        int result3 = root.wurzel(3);
        System.out.println("Wurzel : " + result3);
    }
}
