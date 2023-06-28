package javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.carEngine;

public class Car {
    // Attributes
    private String brand;
    private String model;
    private Engine engine;

    // Empty Constructor
    public Car(){}

    // Constructor Overloaded
    public Car(String brand, String model, Engine engine){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
