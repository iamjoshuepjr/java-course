package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

import javax.swing.JOptionPane;

// Object Class
public class Vehicle {
    // Attributes
    private float rentalRatePrice;
    private String registrationNumber;
    private String make;
    private String model;
    private short year;

    // Constructor
    public Vehicle(float rentalRatePrice, String registrationNumber, String make, String model, short year){
        this.rentalRatePrice = rentalRatePrice;
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and Setters

    public float getRentalRatePrice() {
        return rentalRatePrice;
    }

    public void setRentalRatePrice(float rentalRatePrice) {
        this.rentalRatePrice = rentalRatePrice;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    // Methods
    public void calculateRentalCost(float time) {
        float cost = rentalRatePrice * time;
        JOptionPane.showMessageDialog(null, "VEHICLE RENTAL COST" +
                "\nTime: " + time + " Hours" +
                "\nHour Cost:  $USD " + rentalRatePrice +
                "\nRental Cost: $USD " + cost
        );
    }
    public void information(){
        JOptionPane.showMessageDialog(null, "VEHICLE INFORMATION " +
                "\nMake: " + getMake() +
                "\nRegistration Number " + getRegistrationNumber() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear()
        );
    }
}