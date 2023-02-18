package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class EvenOdd {
    public static void main(String[] args) {
        /*
        * Ask for a number until it is zero, and determinate if it is odd or even. */
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
        while (number != 0){
            if(number % 2 == 0){
                JOptionPane.showMessageDialog(null, "Number: ("+number+") is even!");
            }else {
                JOptionPane.showMessageDialog(null, "Number: ("+number+") is odd!");
            }
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number here: "));
        }
    }
}
