package javaObjectOrientedProgramming.theory.createClasses.classes;
import javax.swing.JOptionPane;

// Object Class
public class ArithmeticOperations {

    // Methods
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int module(int a, int b) {
        return a % b;
    }

    public void displayResult(int sum, int difference, int product, int quotient, int remainder){
        JOptionPane.showMessageDialog(null, "Arithmetic Operations" +
                "\nSum: " +sum+
                "\nDifference: " +difference+
                "\nProduct: " +product+
                "\nQuotient: " +quotient+
                "\nRemainder: " +remainder
        );
    }
}