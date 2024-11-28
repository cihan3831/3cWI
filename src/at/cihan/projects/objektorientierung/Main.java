package at.cihan.projects.objektorientierung;

public class Main {
    public static void main(String[] args) {


        Car c1 = new Car();
        c1.brand="Audi";
        c1.fuelConsumption=7;
        c1.serialnumber="A1234";
        c1.fuelAmount=70;
        c1.color = "green";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialnumber = "C1234";
        c2.fuelAmount = 50;

        /*
        Car c3 = new Car(17,"Opel","1234O");

        System.out.println(c3.serialnumber);

         */

        /*
        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        // Neue Methoden testen
        c2.doBreak();
        c2.turboBoost();
        c2.honk(3);
        System.out.println("Remaining range: " + c2.getRemainingRange() + " km");
         */

    }
}