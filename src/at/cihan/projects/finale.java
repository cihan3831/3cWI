package at.cihan.projects;

public class finale {
    final int x = 10;

    public static void main(String[] args) {
        finale myObj = new finale();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
