package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

import javax.swing.JOptionPane;

public class Car extends Vehicle {
    // Attributes Subclass
    private float fuelEfficiency;
    private boolean hasGPSNavigation;
    private String color;

    // Constructor
    public Car(float rentalRatePrice, float hourlyRate, float dailyRate, String registrationNumber, String make, String model, short year, float fuelEfficiency, boolean hasGPSNavigation, String color) {
        super(rentalRatePrice, hourlyRate, dailyRate, registrationNumber, make, model, year);
        this.fuelEfficiency = fuelEfficiency;
        this.hasGPSNavigation = hasGPSNavigation;
        this.color = color;
    }

    @Override
    public void information(String title) {
        JOptionPane.showMessageDialog(null, title +
                "\nMake: " + this.getMake() +
                "\nColor: " + color +
                "\nRegistration Number " + this.getRegistrationNumber() +
                "\nModel: " + this.getModel()  +
                "\nYear: " +  this.getYear() +
                "\nFuel Efficiency: " + fuelEfficiency + " MPG" +
                "\nGPS: " + hasGPSNavigation
        );
    }

    @Override
    public float calculateRentalCost(float time) {
        return super.calculateRentalCost(time);
    }
}