package at.cihan.projects.objektorientierung;

public class Car {
        // Instanz / Gedächtnisvariablen

        // don't do that later
        private int fuelConsumption;
        private int Tank;
        private int fuelAmount;
        private String brand;
        private String serialnumber;
        private String color;

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

        public void setTank(int tank){
                Tank = tank;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setFuelAmount(int fuelAmount) {
                this.fuelAmount = fuelAmount;
        }

        public void setFuelConsumption(int fuelConsumption) {
                this.fuelConsumption = fuelConsumption;
        }

        public void setSerialnumber(String serialnumber) {
                this.serialnumber = serialnumber;
        }

        public String getBrand() {
                return brand;
        }

        public String getColor() {
                return color;
        }

        public int getFuelAmount() {
                return fuelAmount;
        }
}