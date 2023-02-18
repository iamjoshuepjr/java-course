package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class ShowFrom1toN {
    public static void main(String[] args) {
        /*
        * Ask for a number n, and display all numbers from 1 to n
        * */

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));

        for (int i = 1; i <= number; i++){
            JOptionPane.showMessageDialog(null, "Number: "+i);
        }
    }
}
