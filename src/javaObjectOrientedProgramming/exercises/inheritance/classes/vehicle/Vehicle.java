package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

import javax.swing.JOptionPane;

// Object Class
public class Vehicle {
    // Attributes
    private float rentalRatePrice;
    private float hourlyRate;
    private float dailyRate;
    private String registrationNumber;
    private String make;
    private String model;
    private short year;

    // Constructor
    public Vehicle(float rentalRatePrice, float hourlyRate, float dailyRate, String registrationNumber, String make, String model, short year){
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
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
    public float calculateRentalCost(float time) {
        float rentalCost = 0.0F;
        if (time <= 1) {
            rentalCost = rentalRatePrice;
        } else if (time <= 24) {
            rentalCost = (float) (rentalRatePrice + (Math.ceil(time) - 1) * hourlyRate);
        } else {
            int fullDays = (int) (time / 24);
            int remainingHours = (int) (time % 24);
            rentalCost = rentalRatePrice + fullDays * dailyRate + remainingHours * hourlyRate;
        }

        return rentalCost;
    }
    public void information(String title){
        JOptionPane.showMessageDialog(null, title +
                "\nMake: " + getMake() +
                "\nRegistration Number " + getRegistrationNumber() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear()
        );
    }
}