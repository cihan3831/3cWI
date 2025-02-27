package at.cihan.projects.objektorientierung.Zoo;

public class Dog extends Animal {
    public Dog(int height, int weight) {
        super(height, weight);
    }

    public void bark(){
        System.out.println("wuffff");
    }
}
