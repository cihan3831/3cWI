package at.cihan.projects.objektorientierung;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;// Diesel oder Benzin
    private int tank;

    public Engine(int horsePower, TYPE type, int tank) {
        this.horsePower = horsePower;
        this.type = type;
        this.tank = tank;
    }
    /* amount should be between 0 and 100*/

    public void drive(int speed){

        if (speed < 30){
            this.tank -= 1;
        } else if (speed<60){
            this.tank -= 3;
        } else if (speed>60){
            this.tank -= 5;
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }
}
