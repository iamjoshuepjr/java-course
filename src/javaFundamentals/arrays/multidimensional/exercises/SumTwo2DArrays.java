package javaFundamentals.arrays.multidimensional.exercises;

import javax.swing.JOptionPane;

public class SumTwo2DArrays {
    public static void main(String[] args) {
        /**
         * Creates two 2D arrays of size 3x3, then add them and display their sum
         */

        byte[][] array1 = new byte[3][3];
        byte[][] array2 = new byte[3][3];
        byte[][] array3 = new byte[3][3];

        // filling the arrays
        JOptionPane.showMessageDialog(null, "The following numbers you are going to enter must be:\nNo greater than 127\nNo less than -128");
        JOptionPane.showMessageDialog(null, "Array 1");
        for (byte i = 0; i < array1.length; i++) {
            for (byte j = 0; j < array1[i].length; j++) {
                array1[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the element at ["+i+"]["+j+"] position"));
            }
        }

        JOptionPane.showMessageDialog(null, "Array 2");
        for (byte i = 0; i < array2.length; i++) {
            for (byte j = 0; j < array2[i].length; j++) {
                array2[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the element at ["+i+"]["+j+"] position"));
            }
        }

        // adding
        for (byte i = 0; i < array3.length; i++) {
            for (byte j = 0; j < array3[i].length; j++) {
                array3[i][j] = (byte) (array1[i][j] + array2[i][j]);
            }
        }

        // displaying sum
        JOptionPane.showMessageDialog(null, "Array 3");
        for (byte i = 0; i < array3.length; i++) {
            for (byte j = 0; j < array3[i].length; j++) {
                System.out.print(" " + array3[i][j]);
            }
            System.out.println("");
        }
    }
}