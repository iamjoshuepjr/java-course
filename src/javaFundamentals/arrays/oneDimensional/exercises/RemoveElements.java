package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class RemoveElements {
    public static void main(String[] args) {
        /*
         * Ask for an array of 10 integers.
         * Then ask for a position.
         * Remove the element in the given position without skip order.
         */

        // create the array
        byte[] numbers = new byte[10];
        byte position = 0;

        // filling the array
        for (byte i = 0; i < 6; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element from the Array"));
        }

        position = Byte.parseByte(JOptionPane.showInputDialog("Enter the position of the element you want to remove"));

        // removing the element
        for (byte i = (byte) (position); i < (numbers.length - 1); i++) {
            numbers[i-1] = numbers[i];
        }

        for(byte i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }

    }
}
