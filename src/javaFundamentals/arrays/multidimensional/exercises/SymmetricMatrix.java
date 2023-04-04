package javaFundamentals.arrays.multidimensional.exercises;

import javax.swing.JOptionPane;

public class SymmetricMatrix {
    public static void main(String[] args) {
        /***
         * Creates and fills a 2D array of size 'n' x 'm'
         * and then determines whether the matrix is symmetric or not.
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

        // Check if the matrix is symmetric
        var symmetric = true;
        if(arrays == indexes){
            JOptionPane.showMessageDialog(null, "Square Matrix!");
            byte i = 0, j = 0;
            while (i < arrays && symmetric == true){
                j = 0;
                while (j < i && symmetric == true){
                    if(matrix[i][j] != matrix[j][i]){
                        symmetric = false;
                        break;
                    }
                    j++;
                }
                i++;
            }

            if(symmetric){
                JOptionPane.showMessageDialog(null, "Matrix is symmetric!");
                System.out.println("Matrix");
                for (i = 0; i < matrix.length ; i++) {
                    for (j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println("");
                }
                System.out.println("Matrix Transposed");
                for (i = 0; i < matrix.length ; i++) {
                    for (j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[j][i]);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Matrix is not symmetric!");
                System.out.println("Matrix");
                for (i = 0; i < matrix.length ; i++) {
                    for (j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println("");
                }
                System.out.println("Matrix Transposed");
                for (i = 0; i < matrix.length ; i++) {
                    for (j = 0; j < matrix[i].length; j++) {
                        System.out.print(" " + matrix[j][i]);
                    }
                    System.out.println("");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Not Square Matrix!\nMatrix is not symmetric!");
        }
    }
}
