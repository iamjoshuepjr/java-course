package javaObjectOrientedProgramming.theory.createClasses.classes;

import javax.swing.JOptionPane;

// Object Class
public class Cat {

    // Attributes
    public String name;
    public byte age;
    public String breed;
    public String color;
    public boolean isHungry;

    // Methods
    public void sleep(){
        JOptionPane.showMessageDialog(null, "Shhhhhhh! "+ name + "is Sleeping.");
    }

    public void eat(boolean isHungry){
        if(isHungry){
            JOptionPane.showMessageDialog(null, "So cute, " +name+ " is eating its favourite food.");
        } else {
            JOptionPane.showMessageDialog(null, "Don't feed " +name+ ", it already ate.");
        }

    }

    public void play(){
        JOptionPane.showMessageDialog(null, "Oh, my God! "+name+" wants to play with you!");
    }

    public void meow(){
        JOptionPane.showMessageDialog(null, "Listen to "+name+ " it's saying meow!");
    }
}