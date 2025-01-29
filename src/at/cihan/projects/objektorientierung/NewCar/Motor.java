package at.cihan.projects.objektorientierung.NewCar;

public class Motor {
    private String type;
    private int power;

    public Motor(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
