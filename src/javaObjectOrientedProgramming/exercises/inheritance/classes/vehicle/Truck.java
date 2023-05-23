package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

public class Truck extends Vehicle{
    private float cargoCapacity;


    // Constructor
    public Truck(float rentalRatePrice, String registrationNumber, String make, String model, short year, float cargoCapacity){
        super(rentalRatePrice, registrationNumber, make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and Setters
    public float getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(float cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    // Override calculateRentalCost()

    @Override
    public void calculateRentalCost(float time) {
        super.calculateRentalCost(time);
    }
}