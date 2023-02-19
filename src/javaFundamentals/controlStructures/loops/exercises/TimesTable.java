package javaFundamentals.controlStructures.loops.exercises;

import  javax.swing.JOptionPane;

public class TimesTable {
    public static void main(String[] args) {
        /* Ask for a number between 1 and 10, and display its times table */
        var number = Byte.parseByte(JOptionPane.showInputDialog("Times Table\nEnter a number between 1 and 10: "));
        JOptionPane.showMessageDialog(null, "Times Table from "+number);
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
