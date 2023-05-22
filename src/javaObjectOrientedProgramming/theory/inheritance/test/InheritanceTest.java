package javaObjectOrientedProgramming.theory.inheritance.test;

import javaObjectOrientedProgramming.theory.inheritance.classes.Dog;

import javax.swing.JOptionPane;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        JOptionPane.showMessageDialog(null, "Dog Name: " + dog.getName());
        dog.speak();
    }
}