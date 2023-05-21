package javaObjectOrientedProgramming.theory.inheritance.theory.classes;

import javax.swing.JOptionPane;

/**
 *  ==========================================================
 *                       Inheritance
 *  ==========================================================
 *  Inheritance in Java is a mechanism that allows class to
 *  inherit the properties (attributes/fields) and behaviors
 *  (methods) of another class.
 *  It enables code reuse and the creation of a hierarchical
 *  relationship between classes.
 */

// Object Class
// Superclass
public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void speak() {
        JOptionPane.showMessageDialog(null, "The animal makes a sound!");
    }
}