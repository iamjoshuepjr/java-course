package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class Mixing2Arrays2 {
    public static void main(String[] args) {
        /**
         * Ask for two array of 10 integers. (must be entered in ascending order)
         * Then copy the second array in the first array without skip order.
         */

        byte[] array1 = new byte[10];
        byte[] array2 = new byte[10];

        // auxiliaries variables
        byte aux = 0, position = 0, newNumber;
        boolean ascending = true;

        // filling array and validating its order
        do{
            // filling Array
            JOptionPane.showMessageDialog(null, "ARRAY 1");
            for(byte i = 0; i < array1.length; i++){
                array1[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element of the array 1: "));
            }

            JOptionPane.showMessageDialog(null, "ARRAY 2");
            for(byte i = 0; i < array1.length; i++){
                array2[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element of the array 2: "));
            }

            // checking order of the array
            for (byte i = 0; i < 9; i++){
                if (array1[i] < array1[i+1]){
                    ascending = true;
                }

                if (array1[i] > array1[i+1]){
                    ascending = false;
                    break;
                }

                if (array2[i] < array2[i+1]){
                    ascending = true;
                }

                if (array2[i] > array2[i+1]){
                    ascending = false;
                    break;
                }
            }

            if (ascending == false){
                JOptionPane.showMessageDialog(null, "Warning!\nOne or both arrays are not in increasing order. Enter numbers again.");
            }
        }while (ascending == false);

        // mixing arrays
        // Copy contents of first array to third array
        // Create third array with length equal to sum of lengths of first and second array
        byte[] array3 = new byte[array1.length + array2.length];

        // Copy contents of first array to third array
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Copy contents of second array to third array, starting at the end of the first array
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // Print contents of third array
        JOptionPane.showMessageDialog(null, "Array 3");

        for (int i = 0; i < array3.length; i++) {
            if(i < array3.length - 1){
                System.out.print(array3[i] + " - ");
            }
            else {
                System.out.print(array3[i]);
            }
        }
    }
}
