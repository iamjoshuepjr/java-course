package javaObjectOrientedProgramming.exercises.inheritance.classes.vehicle;

// Subclass
public class Motorcycle extends Vehicle{
    private float engineCapacity;

    public Motorcycle(float rentalRatePrice, String registrationNumber, String make, String model, short year, float engineCapacity){
        super(rentalRatePrice, registrationNumber, make, model, year);
        this.engineCapacity = engineCapacity;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}