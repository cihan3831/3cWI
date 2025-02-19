package at.cihan.projects.objektorientierung.Car;

public class Truck extends Car {
    private String trailer;

    public Truck(Engine engine, String brand, String color, String trailer) {
        super(engine, brand, color, trailer);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        System.out.println("i am driving the truck - consumption is high");
        //super.drive();
    }
}
