package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;

public class PositiveNegative {
    public static void main(String[] args) {
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));
        while (number != 0){
            if(number > 0){
                JOptionPane.showMessageDialog(null, number +" is a positive number.");
            }else {
                JOptionPane.showMessageDialog(null, number +" is a negative number.");
            }
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number here: "));
        }
    }
}
