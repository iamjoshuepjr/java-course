package javaObjectOrientedProgramming.theory.methodOverload;

import javax.swing.JOptionPane;

public class Bovine {
    // Attributes
    String breed;
    int age;
    float weight;

    // Constructors
    public Bovine(String breed, int age, float weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // Methods
    public void eat(){
        JOptionPane.showMessageDialog(null, "The bovine is eating.");
        weight += 10;
    }

    // Method overloaded
    public void eat(String food){
        JOptionPane.showMessageDialog(null, "The bovine is eating " +food+ ".");
        weight += 10;
    }

    public void moo(){
        JOptionPane.showMessageDialog(null, "MOOOOOOOOO!");
    }

    public void moo(int n_times){
        for (int i = 0; i < n_times; i++) {
            JOptionPane.showMessageDialog(null, "MOOOOOOOOO!");
        }
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Bovine Information" +
                "\nBreed: " +breed +
                "\nAge: " +age+ " years" +
                "\nWeight: "+weight+ " pounds");
    }
}