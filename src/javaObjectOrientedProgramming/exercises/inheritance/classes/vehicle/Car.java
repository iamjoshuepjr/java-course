package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

import javax.swing.JOptionPane;

public class Car extends Vehicle {
    // Attributes Subclass
    private float fuelEfficiency;
    private boolean hasGPSNavigation;
    private String color;

    // Constructor
    public Car(float rentalRatePrice, String registrationNumber, String make, String model, short year, float fuelEfficiency, boolean hasGPSNavigation, String color) {
        super(rentalRatePrice, registrationNumber, make, model, year);
        this.fuelEfficiency = fuelEfficiency;
        this.hasGPSNavigation = hasGPSNavigation;
        this.color = color;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "CAR INFORMATION " +
                "\nMake: " + this.getMake() +
                "\nColor: " + color +
                "\nRegistration Number " + this.getRegistrationNumber() +
                "\nModel: " + this.getModel()  +
                "\nYear: " +  this.getYear() +
                "\nFuel Efficiency: " + fuelEfficiency + " GPM" +
                "\nGPS: " + hasGPSNavigation
        );
    }

    @Override
    public void calculateRentalCost(float time) {
        float distance = fuelEfficiency * time;
        float cost = distance * this.getRentalRatePrice();
        JOptionPane.showMessageDialog(null, "CAR RENTAL COST" +
                "\nTime: " + time + " Hours" +
                "\nHour Cost:  $USD " + super.getRentalRatePrice() +
                "\nRental Cost: $USD " + cost
        );
    }
}