package javaObjectOrientedProgramming.theory.inheritance.classes;

import javax.swing.JOptionPane;

/**
 *  ============================================================
 *                       Inheritance
 *  ============================================================
 *  To implement inheritance in Java, you use 'extends' keyword.
 *  The subclass (child class) inherits from the superclass
 *  (parent class) and gains access to its public and protected
 *  members. The subclass can them add its own additional members
 *  or override the inherited ones.
 */

// Object Class
// Subclass
public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        JOptionPane.showMessageDialog(null, "The dog barks!");
    }
}