package javaFundamentals.arrays.multidimensional.exercises;

public class MainDiagonal {
    public static void main(String[] args) {
        /**
         * Creates a 2D array of size 7x7, and fills it
         * with 1s on the main diagonal and 0s elsewhere
         */

        // Creating matrix
        byte[][] matrix = new byte[7][7];

        // fill tha matrix with 1s on the main diagonal and 0s elsewhere
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
