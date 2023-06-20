package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.IfElse;

import javax.swing.JOptionPane;

public class DisplayDecreasingOrder {
    public static void main(String[] args) {

        // Take three numbers and display them in decreasing order

        // Variables and input
        var number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number here: "));
        var number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number here: "));
        var number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number here: "));

        // process

        if((number1 > number2) && (number2 > number3)){
              JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number1+"\nSecond: "+number2+"\nThird: "+number3);
        }
        else if ((number1 > number3) && (number3 > number2)) {
             JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number1+"\nSecond: "+number3+"\nThird: "+number2);

        }else if ((number2 > number1) && (number1 > number3)){
            JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number2+"\nSecond: "+number1+"\nThird: "+number3);

        } else if ((number2 > number3) && (number3 > number1)) {
            JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number2+"\nSecond: "+number3+"\nThird: "+number1);

        }else if ((number3 > number1) && (number1 > number2)){
            JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number3+"\nSecond: "+number1+"\nThird: "+number2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Decreasing Order\nFirst: "+number3+"\nSecond: "+number2+"\nThird: "+number1);
        }
    }
}