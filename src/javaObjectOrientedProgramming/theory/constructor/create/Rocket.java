package javaObjectOrientedProgramming.theory.constructor.create;

import javax.swing.*;

/**
 *  A constructor method in object-oriented programming is a special method within a class
 *  that is responsible for initializing the object's state when it is created or instantiated.
 *  Its purpose is to ensure that the object starts with valid and meaningful values for its attributes.
 */

public class Rocket {

    // Attributes
    String name;
    float mass;
    float velocity;

    // Constructor
    public Rocket(String name, float mass, float velocity){
        this.name = name;
        this.mass = mass;
        this.velocity = velocity;
    }

    public void displayInfo(){
        JOptionPane.showMessageDialog(null, "Rocket Specification" +
                "\nName: "+ name +
                "\nMass: "+ mass +
                "\nVelocity: " + velocity + " km/h");
    }
}
