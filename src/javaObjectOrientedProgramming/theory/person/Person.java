package javaObjectOrientedProgramming.theory.person;

import javax.swing.JOptionPane;

// Object Class
public class Person {

    // Attributes
    String name;
    String lastname;
    byte age;
    String occupation;

    // Methods
    void sayHello(){
        JOptionPane.showMessageDialog(null, "Hello, my name is "+name+ " " +lastname+" and I'm "+age+ " years old!\nCurrently I'm a self-taught" +occupation+" student.");
    }
}