package javaFundamentals.arrays.multidimensional.exercises;

public class MacroMatrix {
    public static void main(String[] args) {
        byte[][] matrix = new byte[5][5];

        // fill the matrix
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 4){
                    matrix[i][j] = 1;
                } else if (j == 0 || j == 4) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
