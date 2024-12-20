package at.cihan.projects.objektorientierung;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 48);
        Car c1 = new Car(e1, 33, "Mercedes", "blue", 100);

        c1.getEngine().drive(100);
        System.out.println(c1.getEngine().getTank());

        /*
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);

         */

        /*
        Car c1 = new Car(e1, "Audi", "grün");
        c1.addMirror(r1);
        c1.addMirror(r2);

         */


/*
        System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println(c1.getEngine().getHorsePower());
        }

 */

        /*
        Car c2 = new Car(6,40, 60,"Mercedes", "C1234","black");
        Car c3 = new Car(9,35, 100,"BMW", "B1234","blue");

         */

/*
        System.out.println("Car 1: " + c1.getBrand() + ", Farbe: " + c1.getColor());
        System.out.println("Car 2: " + c2.getBrand() + ", Farbe: " + c2.getColor());
        System.out.println("Car 3: " + c3.getBrand() + ", Farbe: " + c3.getColor());

 */



        /*
        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setColor("green");
        c1.setTank(70);

         */

        /*
        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialnumber = "C1234";
        c2.fuelAmount = 50;
        c2.setTank(60);
        c2.setColor("black");

         */

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
