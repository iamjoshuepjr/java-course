package javaObjectOrientedProgramming.exercises.interfaces.classes.tesla.abstracts;

public abstract class Car {
    // Attributes
    private String model;
    private String vin;

    // Constructor
    public Car(String model, String vin){
        this.model = model;
        this.vin = vin;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    // Abstract Methods
    public abstract void start();
    public abstract void stop();

}