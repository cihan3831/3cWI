package at.cihan.projects.objektorientierung;

public class Car {
        // Instanz / Gedächtnisvariablen

        // don't do that later
        public int fuelConsumption;
        public int fuelAmount;
        public String brand;
        public String serialnumber;
        public String color;
        private int amountFuelIntMotor;

        /*

        public Car(int fc, String b, String s ){
                this.fuelConsumption = fc;
                this.brand = b;
                this.serialnumber = s;
        }

         */

        //Methode: Fahren
        public void drive(){
                this.fuelAmount = this.fuelAmount-fuelConsumption;
                System.out.println("I am driving");
        }

        //Methode: Bremsen
        public void doBreak() {
                System.out.println("Ich bremse");
        }

        //Methode: Turbo Boost
        public void turboBoost() {
                if (fuelAmount > 10) {
                        System.out.println("SuperBoostMode");
                } else {
                        System.out.println("Not enough fuel to go to Superboost");
                }
        }

        //Methode: Hupen
        public void honk(int amountOfRepetitions) {
                for (int i = 0; i < amountOfRepetitions; i++) {
                        System.out.println("Tuuut");
                }
        }

        //Methode: Rest-Reichweite
        public int getRemainingRange() {
                return fuelAmount * 100 / fuelConsumption;
        }
    }