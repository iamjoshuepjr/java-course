package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class MoveElements {
    public static void main(String[] args) {

        // Create the Array
        byte[] numbers = new byte[10];

        // Create Auxiliary Variables
        byte last;

        // Filling the Array
        for (byte i = 0; i < 10; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+") element from the Array"));
        }
        // Save the last element
        last = numbers[9];

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
