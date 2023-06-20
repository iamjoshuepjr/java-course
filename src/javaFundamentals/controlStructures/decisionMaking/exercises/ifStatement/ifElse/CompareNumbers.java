package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.ifElse;

import javax.swing.JOptionPane;

public class CompareNumbers {
    public static void main(String[] args) {
        var number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number here: "));
        var number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number here: "));

        if(number1 > number2){
            JOptionPane.showMessageDialog(null, "The first number ("+number1+") is greater than second number ("+number2+") ");
        } else if (number2 > number1) {
            JOptionPane.showMessageDialog(null, "The second ("+number2+") is greater than first number ("+number1+") ");
        }else {
            JOptionPane.showMessageDialog(null, "The first number ("+number2+") and the second number ("+number1+") are equals!");
        }
    }
}