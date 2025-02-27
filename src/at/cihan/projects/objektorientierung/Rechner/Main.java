package at.cihan.projects.objektorientierung.Rechner;

public class Main {
    public static void main(String[] args) {
        Basics basicCalculator = new Basics();
        System.out.println("Addition + : " + basicCalculator.add(10,5.5));
        System.out.println("Subtraktion - : " + basicCalculator.sub(20,17));

        Scientific scientificCalculator = new Scientific();
        int result2 = scientificCalculator.sinus(9);
        System.out.println("Sinus : " + result2);

        Root root = new Root();
        int result3 = root.wurzel(3);
        System.out.println("Wurzel : " + result3);
    }
}
