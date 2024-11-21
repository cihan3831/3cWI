package at.cihan.projects.objektorientierung;

public class Car {
        // Instanz / Gedächtnisvariablen

        // don't do that later
        public int fuelConsumption;
        public int fuelAmount;
        public String brand;
        public String serialnumber;
        private String color;

        //Methode
        public void drive(){
                this.fuelAmount=this.fuelAmount-fuelConsumption;
                System.out.println("I am driving");
        }
    }

