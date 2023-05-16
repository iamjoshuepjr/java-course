package javaObjectOrientedProgramming.theory.cat;

import javax.swing.JOptionPane;

// Object Class
public class Cat {

    // Attributes
    String name;
    byte age;
    String breed;
    String color;
    boolean isHungry;

    // Methods
    void sleep(){
        JOptionPane.showMessageDialog(null, "Shhhhhhh! "+ name + "is Sleeping.");
    }

    void eat(boolean isHungry){
        if(isHungry){
            JOptionPane.showMessageDialog(null, "So cute, " +name+ " is eating its favourite food.");
        } else {
            JOptionPane.showMessageDialog(null, "Don't feed " +name+ ", it already ate.");
        }

    }

    void play(){
        JOptionPane.showMessageDialog(null, "Oh, my God! "+name+" wants to play with you!");
    }

    void meow(){
        JOptionPane.showMessageDialog(null, "Listen to "+name+ " it's saying meow!");
    }
}
