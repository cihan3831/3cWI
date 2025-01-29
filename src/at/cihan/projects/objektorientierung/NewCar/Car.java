package at.cihan.projects.objektorientierung.NewCar;

public class Car {
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseConsumption;
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
            return baseConsumption * 1.098; //Verbrauch 9,8% höher
        }
    }

    public String getColor(){
        return color;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public Manufacturer getManufacturer(){
        return manufacturer;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}




