package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class BackwardString {
    public static void main(String[] args) {
        var text = JOptionPane.showInputDialog("Enter a text here: ");
        // Calculating length
        var length = text.length();

        // Creating Array
        char[] character = new char[length];
        var inverse = length;

        for (byte i = 0; i < length; i++) {
            character[i] = text.charAt(inverse -1);
            inverse--;
        }
        System.out.println(character);
    }
}
