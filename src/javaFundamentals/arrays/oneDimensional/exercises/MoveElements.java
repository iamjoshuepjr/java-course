package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class MoveElements {
    public static void main(String[] args) {

        /*
         * Ask for an array of 10 integers and move them one position later.
         * The first element will be the second, the second will be the third...
         * and the last, will be the first.
         */

        // Create the Array
        byte[] numbers = new byte[10];

        // Create Auxiliary Variable
        byte last;

        // Filling the Array
        for (byte i = 0; i < 10; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+") element from the Array"));
        }
        // Save the last element
        last = numbers[9];

        // sorting the array
        for(byte i = 8; i >= 0; i--){
            numbers[i+1] = numbers[i];
        }
        numbers[0] = last;

        JOptionPane.showMessageDialog(null, "The new Array is: ");
        for (byte i = 0; i < 10; i++) {
            System.out.println("numbers["+i+"] " +numbers[i]);
        }
    }
}
