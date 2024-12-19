package at.cihan.projects.objektorientierung;

import java.util.List;
import java.util.ArrayList;

public class Car {
        // Instanz / Gedächtnisvariablen
        // don't do that later
        private Engine engine;
        private int fuelUsage;
        private List<RearMirror> mirrors;
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
        }

        public void addMirror(RearMirror rearMirror) {
                this.mirrors.add(rearMirror);
        }

        public List<RearMirror> getMirrors() {
                return mirrors;
        }

        public void honk(){


                System.out.println("Ich bin ein " + this.brand + " und habe die farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + " ps.");
                this.honkCounter++;
        }

        public String getBrand() { return brand; }

        public void setBrand(String brand) {this.brand=brand;}

        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}

        public int getHonkCounter() {return honkCounter;}

        public Engine getEngine() {
                return engine;
        }

        public void setEngine(Engine engine) {
                this.engine = engine;
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
        */


}