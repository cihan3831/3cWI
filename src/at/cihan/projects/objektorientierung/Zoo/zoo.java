package at.cihan.projects.objektorientierung.Zoo;

import java.util.ArrayList;
import java.util.List;

public class zoo {
    private String name;
    private String street;
    private List<animal> animals;

    public zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }

    public void makeShow(){
        System.out.println("The show just had started");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
