package javaFundamentals.arrays.multidimensional.exercises;

public class TransposedMatrix2 {
    public static void main(String[] args) {
        /**
         * Creates and fill a 2D array and display its transposed matrix
         */

        byte[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
