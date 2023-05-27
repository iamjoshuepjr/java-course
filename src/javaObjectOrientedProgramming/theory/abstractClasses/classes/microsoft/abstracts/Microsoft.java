package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts;

// Superclass (Abstract Class)
// Object Class

public abstract class Microsoft {
    // Attributes
    private String name;
    private short foundingYear;

    // Constructor
    public Microsoft(String name, short foundingYear){
        this.name = name;
        this.foundingYear = foundingYear;
    }

    // Concrete Methods
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(short foundingYear) {
        this.foundingYear = foundingYear;
    }

    // Abstract Methods
    public abstract void information();
}