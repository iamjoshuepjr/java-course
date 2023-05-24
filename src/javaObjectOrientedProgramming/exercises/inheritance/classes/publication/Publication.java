package javaObjectOrientedProgramming.exercises.inheritance.classes.publication;

import javax.swing.*;

// Superclass
// Object Class
public class Publication {
    // Attributes
    private String title;
    private float price;

    // Constructor
    public Publication(String title, float price){
        this.title = title;
        this.price = price;
    }

    // Getter and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void information(){}
}
