package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

// Object Class
public class Vehicle {
    // Attributes
    private String registrationNumber;
    private String make;
    private String model;
    private short year;

    // Constructor
    public Vehicle(String registrationNumber, String make, String model, short year){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void calculateRentalCost(){

    }
}
