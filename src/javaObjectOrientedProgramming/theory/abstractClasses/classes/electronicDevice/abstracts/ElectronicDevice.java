package javaObjectOrientedProgramming.theory.abstractClasses.classes.electronicDevice.abstracts;

// Superclass
// Object Class
public abstract class ElectronicDevice {
    // Attributes
    private String brand;
    private String model;
    private short year;

    // Constructor
    public ElectronicDevice(String brand, String model, short year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract Methods
    public abstract void  turnOn();
    public abstract void turnOff();

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}