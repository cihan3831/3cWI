package at.cihan.projects.objektorientierung.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Truck t1 = new Truck(e1, "Mercedes", "green", "trailer1");

        System.out.println(t1.getColor() + t1.getTrailer());


        /* 11
        public class Main {
            public static void main(String[] args) {

                Manufacturer manufacturer = new Manufacturer("Audi", "A7 - Rs7 Optik", "Deutschland", 10.0);
                Motor motor = new Motor("Benzin", 480);

                Car car = new Car("Nardo-Grau", 380, 30000.0, 6.5, manufacturer, motor);

                System.out.println("Hersteller Details -");
                System.out.println("Auto Hersteller: "+manufacturer.getName());
                System.out.println("Hersteller Herkunft: "+manufacturer.getCountry());
                System.out.println("Auto Modell: "+manufacturer.getModell());
                System.out.println("Auto Farbe: "+car.getColor());

                System.out.println("\n");
                System.out.println("Motor Details -");
                System.out.println("Kraftstoff: "+motor.getType());
                System.out.println("Leistung: "+motor.getPower());

                double endPrice = car.calculatePrice();
                System.out.println("Aktueller Preis vom " + manufacturer.getModell() + " beträgt " + car.getBasePrice() + " €");
                System.out.println("Der Preis vom " + manufacturer.getModell() + " beträgt nach dem Rabatt : " + endPrice + " €");

                int kilometers = 60000;
                double consumption = car.calculateConsumption(kilometers);
                System.out.println("Der Verbrauch des Autos bei " + kilometers + " km beträgt: " + consumption + " l/100km");
            }
        }

 */
        /*
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 48);
        Car c1 = new Car(e1, 33, "Mercedes", "blue", 100);

        c1.getEngine().drive(100);
        System.out.println(c1.getEngine().getTank());

        */

        /*Battery
        Battery battery1 = new Battery(90);
        Battery battery2 = new Battery(65);

        RemoteControl remote = new RemoteControl(battery1, battery2);

        System.out.println("Verbraucher angeschlossen: " + remote.getStatus() + "%");
        remote.turnOn();
        System.out.println("Kein Verbraucher angeschlossen: " + remote.getStatus() + "%");
        remote.turnOff();

    }
}

         */


/*
        Engine e1 = new Engine(320, Engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-40);


        Car c1 = new Car(e1, 5, "Audi", "grün", 100);
        c1.addMirror(r1);
        c1.addMirror(r2);

        for (int i = 0; i < c1.getTires().size(); i++) {
            Tires tire = c1.getTires().get(i);
            System.out.println("Reifen " + i + ": " + tire.getTyp() + ", Profiltiefe: " + tire.getProfilTiefe() + " mm.");
        }

        c1.getTires().get(0).aufpumpen(3.0);

        c1.getTires().get(0).abnutzen(2.0);

        Tires newTire = new Tires(17, "Winter", 8.0, 2.5);
        c1.replaceTire(1, newTire);
    }
}


      /*  System.out.println(c1.getMirrors().get(0).getPosition());

        System.out.println(c1.getEngine().getHorsePower());
        }

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
