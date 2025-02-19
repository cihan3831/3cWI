package at.cihan.projects.objektorientierung.Rechner;

public class main {
    public static void main(String[] args) {
        basics basicCalculator = new basics();
        System.out.println("Addition + : " + basicCalculator.add(10,5.5));
        System.out.println("Subtraktion - : " + basicCalculator.sub(20,17));
    }
}
