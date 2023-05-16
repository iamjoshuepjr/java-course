package javaObjectOrientedProgramming.theory.createClasses.classesTest;
import javaObjectOrientedProgramming.theory.createClasses.classes.ArithmeticOperations;

import javax.swing.JOptionPane;

// Class Controller
public class ArithmeticOperationsTest {

    public static void main(String[] args) {

        // Instantiating an ArithmeticOperations object
        ArithmeticOperations operations = new ArithmeticOperations();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 2"));

        // Accessing ArithmeticOperations object methods by passing a, b as arguments
        int sum = operations.add(a, b);
        int difference = operations.subtract(a, b);
        int product = operations.multiply(a, b);
        int quotient = operations.divide(a, b);
        int remainder = operations.module(a, b);

        operations.displayResult(sum, difference, product, quotient, remainder);

    }
}