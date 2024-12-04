package at.cihan.projects.objektorientierung;

public class Car {
        // Instanz / Gedächtnisvariablen

        // don't do that later
        private int fuelConsumption;
        private int tank;
        private int fuelAmount;
        private String brand;
        private String serialNumber;
        private String color;


        public Car(int fuelConsumption, int tank, String brand, String serialNumber, String color) {
                this.fuelConsumption = fuelConsumption;
                this.tank = tank;
                this.brand = brand;
                this.serialNumber = serialNumber;
                this.fuelAmount = 0;
                this.color = color;
        }

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

        public int getTank() {
                return tank;
        }

        public void setTank(int tank) {
                this.tank = tank;
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
                this.serialNumber = serialnumber;
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

        public int getFuelConsumption() {
                return fuelConsumption;
        }

}