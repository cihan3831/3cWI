package at.cihan.projects.objektorientierung.Zoo;

public class Main {
    public static void main(String[] args){
        Animal a1 = new Animal(20,40);
        Animal a2 = new Animal(30,50);

        Zoo zoo = new Zoo("Kinderzoo","Elefantenstrasse");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();

        Dog d1 = new Dog(20,15);
        zoo.addAnimal(d1);
        zoo.printAnimals();
        d1.bark();
    }
}