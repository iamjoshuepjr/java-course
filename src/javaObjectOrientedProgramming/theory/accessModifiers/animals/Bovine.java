package javaObjectOrientedProgramming.theory.accessModifiers.animals;
import javax.swing.JOptionPane;

/**
 * Access modifiers in Java are keywords that determinate the accessibility or
 * visibility of classes, variables, methods, and constructors in Java.
 * There are four (4) different access modifiers in Java:
 *
 * 1. "public": The public access modifiers allows unrestricted access to the
 * class, variable, method or constructor from any other part of the program,
 * including external classes and packages.
 *
 * 2. "private": The private access modifier restricts access to only within the same class.
 * Private members cannot be accessed or modified from outside the class,
 * including other classes in the same package.
 *
 * 3. "protected" The protected access modifier allows access within the same
 * class, package, and subclasses (even if they are in different packages).
 * Protected members are not only accessible by unrelated classes in different packages.
 *
 * 4. "default" (No keyword specified) If no access modifier is explicitly specified,
 * it is considered as the default access modifier.
 * Default access allows access within the same class, and the package.
 * Members with default access are not accessible outside the package,
 * including subclasses in different packages.
 */

// Object Class
public class Bovine {

    // Attributes
    private String breed;        // Private access modifier
    protected String gender;     // Protected access modifier
    String color;                // Default access modifier
    float weight;
    public int age;              // Public access modifier

    // Methods
    public void eat(){
        JOptionPane.showMessageDialog(null, "The bovine is eating.");
        weight += 10;
    }

    // Method overloaded
    private void eat(String food){
        JOptionPane.showMessageDialog(null, "The bovine is eating " +food+ ".");
        weight += 10;
    }

    protected void makeSound(){
        JOptionPane.showMessageDialog(null, "MOOOOOOOOO!");
    }

    void makeSound(int n_times){
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