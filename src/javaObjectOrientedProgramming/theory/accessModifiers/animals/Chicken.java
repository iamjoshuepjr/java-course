package javaObjectOrientedProgramming.theory.accessModifiers.animals;

import javax.swing.JOptionPane;

// Object Class
public class Chicken {

    // Attributes with access modifier
    private String breed;        // Private access modifier
    protected String gender;     // Protected access modifier
    String color;                // Default access modifier
    public int age;              // Public access modifier

    public void peck(){
        JOptionPane.showMessageDialog(null, "Peck, peck");
    }

    public void move() {
        JOptionPane.showMessageDialog(null, "The chicken is moving.");
    }
}
