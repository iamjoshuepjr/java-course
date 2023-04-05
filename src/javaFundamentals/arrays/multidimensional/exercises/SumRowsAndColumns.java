package javaFundamentals.arrays.multidimensional.exercises;

import javax.swing.*;

public class SumRowsAndColumns {
    public static void main(String[] args) {
        /**
         * Creates and fills and 2D array, then add its rows and columns
         */

        // asking for rows/arrays elements/indexes
        JOptionPane.showMessageDialog(null, "The following numbers you are going to enter must be:\nNo greater than 127\nNo less than -128");
        var arrays = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as rows/arrays: "));
        var indexes = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as columns/indexes: "));

        // create and fill the matrix
        byte[][] matrix = new byte[arrays][indexes];
        for (byte i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] element: "));
            }
        }

        // print matrix
        for (byte i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        // add rows4

        for (byte i = 0; i < matrix.length; i++) {
            byte sumArray = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumArray += matrix[i][j];
            }
            System.out.println("Rows sum at ["+i+"] index = " + sumArray);
        }

        // add columns
        for (byte j = 0; j < matrix[0].length ; j++) {
            byte sumIndex = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumIndex += matrix[i][j];
            }
            System.out.println("Columns sum at ["+j+"] index = " + sumIndex);
        }
    }
}