package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;
import javax.swing.JOptionPane;

public class Truck extends Vehicle{
    private float cargoCapacity;


    // Constructor
    public Truck(float rentalRatePrice, float hourlyRate, float dailyRate, String registrationNumber, String make, String model, short year, float cargoCapacity){
        super(rentalRatePrice, hourlyRate, dailyRate, registrationNumber, make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and Setters
    public float getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(float cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void information(String title) {
        JOptionPane.showMessageDialog(null, title +
                "\nMake: " + this.getMake() +
                "\nCargo Capacity: " + cargoCapacity +
                "\nRegistration Number " + this.getRegistrationNumber() +
                "\nModel: " + this.getModel() +
                "\nYear: " + this.getYear()
        );
    }

    @Override
    public float calculateRentalCost(float time) {
        return super.calculateRentalCost(time);
    }
}