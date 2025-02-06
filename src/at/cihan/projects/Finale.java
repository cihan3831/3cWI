package at.cihan.projects;

public class Finale {
    final String marke = "BMW"; // Diese Variable kann nicht geändert werden

    public static void main(String[] args) {
        Finale meinAuto = new Finale();
        // meinAuto.marke = "Audi"; // ❌ Fehler! `marke` ist final und kann nicht geändert werden.
        System.out.println("Mein Auto ist ein: " + meinAuto.marke);
    }
}

