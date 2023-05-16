package javaObjectOrientedProgramming.theory.createClasses.classes;

import javax.swing.JOptionPane;

// Object Class
public class Person {

    // Attributes
    public String name;
    public String lastname;
    public byte age;
    public String occupation;

    // Methods
    public void sayHello(){
        JOptionPane.showMessageDialog(null, "Hello, my name is "+name+ " " +lastname+" and I'm "+age+ " years old!\nCurrently I'm a self-taught" +occupation+" student.");
    }
}