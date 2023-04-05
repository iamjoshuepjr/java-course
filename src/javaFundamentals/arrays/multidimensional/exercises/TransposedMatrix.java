package javaFundamentals.arrays.multidimensional.exercises;

import javax.swing.*;

public class TransposedMatrix {
    public static void main(String[] args) {
        /**
         * Creates and fill a 2D array and display its transposed matrix
         */

        byte[][] matrix = new byte[3][3];

        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] element: "));
            }
        }

        System.out.println("Original Matrix");
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        // transposing the array
        byte aux;
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < i; j++) {
                aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix");
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}