package at.cihan.projects.objektorientierung.Car;

import java.util.List;
import java.util.ArrayList;

/* 11
public class Car {
        private String color;
        private int maxSpeed;
        private double basePrice;
        private double baseConsumption; // Verbrauch in l/100km
        private Manufacturer manufacturer;
        private Motor motor;

        public Car(String color, int maxSpeed, double basePrice, double baseConsumption, Manufacturer manufacturer, Motor motor) {
                this.color = color;
                this.maxSpeed = maxSpeed;
                this.basePrice = basePrice;
                this.baseConsumption = baseConsumption;
                this.manufacturer = manufacturer;
                this.motor = motor;
        }

        public double calculatePrice() {
                double discountAmount = basePrice * (manufacturer.getDiscount() / 100);
                return basePrice - discountAmount;
        }

        public double calculateConsumption(int mileage) {
                if (mileage <= 50000) {
                        return baseConsumption;
                } else {
                        return baseConsumption * 1.098; // Verbrauch um 9.8% höher
                }
        }

        public double getBasePrice() {
                return basePrice;
        }

        public String getColor() {
                return color;
        }

        public int getMaxSpeed() {
                return maxSpeed;
        }

        public Manufacturer getManufacturer() {
                return manufacturer;
        }

        public Motor getMotor() {
                return motor;
        }


        public void setColor(String color) {
                this.color = color;
        }

 */

public class Car {
        // Instanz / Gedächtnisvariablen
        // don't do that later
        private Engine engine;
        private int fuelUsage;
        private List<RearMirror> mirrors;
        private List<Tires> tires;
        private String brand;
        private int honkCounter;
        private String color;
        private int speed;
        private static int myVariable = 7;


        public Car(Engine engine, int fuelUsage, String brand, String color, int speed) {
                this.engine = engine;
                this.fuelUsage = fuelUsage;
                this.honkCounter = 0;
                this.brand = brand;
                this.color = color;
                this.speed = speed;
                this.mirrors = new ArrayList<>();
                this.tires = new ArrayList<>();

                for (int i = 0; i < 4; i++) {
                        this.tires.add(new Tires(17, "Sommer", 8.0, 2.5));
                }
        }

        public Car(Engine engine, String brand, String color) {
        }

        public Car(String brand, String color, String trailer) {
        }

        public Car(Engine engine, String brand, String color, String trailer) {
        }

        public void addMirror(RearMirror rearMirror) {
                this.mirrors.add(rearMirror);
        }

        public List<RearMirror> getMirrors() {
                return mirrors;
        }

        public List<Tires> getTires() {
                return tires;
        }

        public void replaceTire(int index, Tires newTire) {
                if (index < 0 || index >= tires.size()) {
                        System.out.println("Ungültiger Reifen-Index!");
                } else {
                        tires.set(index, newTire);
                        System.out.println("Reifen an Position " + index + " wurde ersetzt.");
                }
        }

        public void honk() {

                System.out.println("Ich bin ein " + this.brand + " und habe die farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + " ps.");
                this.honkCounter++;
        }

        public void drive(){
                System.out.println("I am driving.");
        }

        public void stop(){
                System.out.println("I am breaking... car");

        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public int getHonkCounter() {
                return honkCounter;
        }

        public Engine getEngine() {
                return engine;
        }

        public void setEngine(Engine engine) {
                this.engine = engine;
        }
}

        /*
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

         */