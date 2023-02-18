package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class Sum {
    public static void main(String[] args) {
        /*
        * Ask for a number, until it is zero. Display the sum of all numbers entered.
        * */

        int number, sum = 0;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
            sum += number;

        }while (number != 0);
        JOptionPane.showMessageDialog(null, "Sum: "+sum);
    }
}
