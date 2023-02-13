package javaFundamentals.controlStructures.decisionMaking.exercises;

import javax.swing.JOptionPane;

public class OddEvenNumbers {
    public static void main(String[] args) {
        /* Take two numbers and determinate if both are odd or even */

        // Variables and input
        var number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number here: "));
        var number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number here: "));

        // process

        if ((number1 % 2 == 0) && (number2 % 2 == 0)){
            JOptionPane.showMessageDialog(null, "The first number ("+number1+") and the second number ("+number2+") both are even.");

        } else if ((number1 % 2 == 1) && (number2 % 2 == 1)) {
            JOptionPane.showMessageDialog(null, "The first number ("+number1+") and the second number ("+number2+") both are odd.");

        } else if ((number1 % 2 == 0) && (number2 % 2 == 1)) {
            JOptionPane.showMessageDialog(null, "The first number ("+number1+") is even, and the second number ("+number2+") is odd.");
        }else {
            JOptionPane.showMessageDialog(null, "The first number ("+number1+") is odd, and the second number ("+number2+") is even.");
        }

    }
}
