package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number here to display its factorial: "));
        var factorial = 1;
        if(number < 0){
            JOptionPane.showMessageDialog(null, "What the hell? It's a positive number!");
        }else {
            for (int i = number; i >= 1; i--) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, number+"! = " +factorial);
        }
    }
}
