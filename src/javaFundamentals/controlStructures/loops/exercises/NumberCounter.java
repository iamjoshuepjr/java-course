package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class NumberCounter {
    public static void main(String[] args) {
        /* Ask for a number until it is a negative number, and display how many number are entered */
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
        var count = 0;

        while (number >= 0){
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number here: "));
            count ++;
        }
        JOptionPane.showMessageDialog(null, "You have entered ("+count+") numbers! ");
    }
}
