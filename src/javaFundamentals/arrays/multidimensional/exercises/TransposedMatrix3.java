package javaFundamentals.arrays.multidimensional.exercises;

public class TransposedMatrix3 {
    public static void main(String[] args) {
        /**
         * Creates and fills two 2D arrays.
         * The first of size 5x9, and the second of size 9x5.
         * Fills the first, and then transpose it on the second
         */

        // creates the two 2D arrays
        int[][] originalMatrix = {
                {12, 89, 45, 78, 32, 56, 98, 67, 34},
                {56, 76, 23, 89, 90, 45, 67, 12, 87},
                {34, 21, 90, 76, 54, 12, 67, 89, 78},
                {56, 12, 43, 76, 87, 90, 34, 21, 65},
                {76, 89, 23, 56, 12, 45, 87, 98, 21}
        };

        int[][] transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // print original matrix
        System.out.println("Original matrix");
        for (int i = 0; i < originalMatrix.length ; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // print transposed matrix
        System.out.println("Transposed matrix");
        for (int i = 0; i < transposedMatrix.length ; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}