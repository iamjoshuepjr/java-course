package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

import javax.swing.JOptionPane;

// Subclass
public class Motorcycle extends Vehicle{
    private float engineCapacity;

    public Motorcycle(float rentalRatePrice, float hourlyRate, float dailyRate, String registrationNumber, String make, String model, short year, float engineCapacity){
        super(rentalRatePrice, hourlyRate, dailyRate, registrationNumber, make, model, year);
        this.engineCapacity = engineCapacity;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void information(String title) {
        JOptionPane.showMessageDialog(null, title +
                "\nMake: " + this.getMake() +
                "\nEngine Capacity: " + engineCapacity +
                "\nRegistration Number: " + this.getRegistrationNumber() +
                "\nModel: " + this.getModel()  +
                "\nYear: " +  this.getYear()
        );
    }
    @Override
    public float calculateRentalCost(float time) {
        return super.calculateRentalCost(time);
    }
}