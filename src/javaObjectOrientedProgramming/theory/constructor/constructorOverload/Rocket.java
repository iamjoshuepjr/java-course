package javaObjectOrientedProgramming.theory.constructor.constructorOverload;

/**
 * Constructor overload is a concept in object-programming where a class can
 * have multiple constructors with different parameter lists.
 * Each constructor provides a different way to initialize objects of the class,
 * allowing flexibility and convenience in object creation.
 */

public class Rocket {
    String name;
    float mass;
    float velocity;

    // Constructor with all parameters
    public Rocket(String name, float mass, float velocity){
        this.name = name;
        this.mass = mass;
        this.velocity = velocity;
    }

    // Constructor with name and mass
    public Rocket(String name, float mass){
        this.name = name;
        this.mass = mass;
        this.velocity = 0;
    }

    // Constructor with name only
    public Rocket(String name){
        this.name = name;
        this.mass = 0;
        this.velocity = 0;
    }
}
