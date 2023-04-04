package javaFundamentals.arrays.multidimensional.theory;

import javax.swing.JOptionPane;

public class Filling2DArray {
    public static void main(String[] args) {

        // asking for rows/arrays elements/indexes
        JOptionPane.showMessageDialog(null, "The following numbers you are going to enter must be:\nNo greater than 127\nNo less than -128");
        var arrays = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as rows/arrays: "));
        var indexes = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want as columns/indexes: "));

        // creating the 2D array
        String[][] elements = new String[arrays][indexes];

        // filling array with for loop
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] = JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] element: ");
            }
        }

        // printing array with for loop
        byte iter = 0;
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Array [" + iter + "] ");
            for (int j = 0; j < elements[i].length; j++) {
                if(j == 0){
                    System.out.print(" index[" + j + "] " + elements[i][j]);
                } else {
                    System.out.print(" - index[" + j + "] " + elements[i][j]);
                }
            }
            System.out.println("");
            iter++;
        }
    }
}