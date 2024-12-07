package at.cihan.projects.objektorientierung;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; // Diesel oder Benzin

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }
    /* amound should be between 0 and 100*/

    public void drive(int amount){
        System.out.println("the motor is running" + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType () {
        return type;
    }
}
