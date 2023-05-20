package javaObjectOrientedProgramming.exercises.classes;

import javax.swing.*;

// Object Class
public class Car {
    // Attributes
    private String brand;
    private String model;
    private float price;

    // Constructor
    public Car(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Get Price Method
    public float getPrice(){ return price; }

    // Display information
    public String displayInformation(){
        return  "\nCheaper Car" +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nPrice: $ " +price;
    }
}