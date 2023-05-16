package javaObjectOrientedProgramming.theory.car;

import javax.swing.JOptionPane;

/**
 * OOP is a programming paradigm that focuses on organizing code into objects that interact with each other.
 * It provides a structured way to design and build software systems by modeling real-world objects and their relationships.
 *
 * Classes and objects:
 * A class is a blueprint or template that defines the structure and behavior of objects.
 * An object is an instance of a class that represents a specific entity or concept.
 * Classes encapsulate data (attributes/fields) and behaviors (methods) into objects.
 */

// Object Class
public class Car {

    // attributes
    String brand;
    String color;
    String model;
    short year;

    // methods
    public void start() {
        JOptionPane.showMessageDialog(null, "Staring Car!");
    }

    public void accelerate() {
        JOptionPane.showMessageDialog(null, "Accelerating - Velocity: 80 Km/h");
    }

    public void stop(){
        JOptionPane.showMessageDialog(null, "Stopping - Velocity: 40 Km/h");
    }
}