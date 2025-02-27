package at.cihan.projects.objektorientierung.Zoo;

public class Animal {
    private int height;
    private int weight;

    public Animal(int height, int weight){
        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
