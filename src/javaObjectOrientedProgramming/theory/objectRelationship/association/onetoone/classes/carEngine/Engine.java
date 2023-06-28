package javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.carEngine;

public class Engine {
    // Attributes
    private String type;
    private short horsePower;

    // Empty Constructor
    public Engine(){}

    // Constructor Overloaded
    public Engine(String type, short horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(short horsePower) {
        this.horsePower = horsePower;
    }
}
