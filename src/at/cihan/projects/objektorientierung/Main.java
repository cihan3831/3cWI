package at.cihan.projects.objektorientierung;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand="Audi";
        c1.fuelConsumption=7;
        c1.serialnumber="A1234";
        c1.fuelAmount=70;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialnumber = "C1234";
        c2.fuelAmount = 50;


        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
    }
}
