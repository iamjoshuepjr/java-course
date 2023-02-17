package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;

public class Square {
    public static void main(String[] args) {
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));

        while (number >= 0){
            var square = (int) Math.pow(number, 2);
            JOptionPane.showMessageDialog(null, "Square of "+number+" is "+square);
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter another number here: "));
        }
    }
}
