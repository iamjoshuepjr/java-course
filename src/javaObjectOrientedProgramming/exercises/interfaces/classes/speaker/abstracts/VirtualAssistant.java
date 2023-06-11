package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.interfaces.Speaker;

// Abstract Class (superclass)
// Implementing Class (subclass)

public abstract class VirtualAssistant implements Speaker {
    // Is not required implementation for Speaker Interface's methods (because the class is an abstract class)
    // Attributes
    private String name;
    private String language;
    private float version;
    private String location;

    // Constructor
    public VirtualAssistant(String name, String language, float version, String location){
        this.name = name;
        this.language = language;
        this.version = version;
        this.location = location;
    }

    // Abstracts Methods
    public abstract void activate();
    public abstract void deactivate();
}