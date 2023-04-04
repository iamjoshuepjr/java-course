package javaFundamentals.arrays.multidimensional.theory;

import javax.swing.JOptionPane;

public class Filling2DArray {
    public static void main(String[] args) {

        // asking for rows/arrays elements/indexes
        var arrays = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as rows/arrays: "));
        var indexes = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as columns/indexes: "));

        // creating the 2D array
        String[][] cars = new String[arrays][indexes];

        // filling array with for loop
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                cars[i][j] = JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] car: ");
            }
        }

        // printing array with for loop
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println("Array ["+i+"] - Index ["+j+"] " +cars[i][j]);
            }
            System.out.println("");
        }
    }
}
