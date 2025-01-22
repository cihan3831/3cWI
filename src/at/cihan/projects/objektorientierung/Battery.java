package at.cihan.projects.objektorientierung;

public class Battery {
    private double chargeLevel;

    public Battery(double initialCharge) {
        this.chargeLevel = Math.min(100, Math.max(0, initialCharge));
    }

    public void consume(double amount) {
        chargeLevel = Math.max(0, chargeLevel - amount);
        System.out.println("Verbraucher angeschlossen. Aktueller Ladestatus: " + chargeLevel + "%");
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void disconnect() {
        System.out.println("Kein Verbraucher angeschlossen.");
    }
}
