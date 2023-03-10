package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.*;

public class MoveElements2 {
    public static void main(String[] args) {
        // creating array
        byte[] numbers = new byte[10];

        // auxiliaries
        byte aux, newNumber, position;

        // filling Array
        for (byte i = 0; i < 8; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+") element from the Array: "));
        }

        // saving the new number and position
        position = Byte.parseByte(JOptionPane.showInputDialog("It's ok, now enter position where you do want insert it: "));
        newNumber = Byte.parseByte(JOptionPane.showInputDialog("Enter a new number here: "));

        // fixing the array
        for (int i = (position - 1); i < numbers.length - 1; i++) {
            aux = numbers[i];
            numbers[i] = newNumber;
            newNumber = aux;
        }

        // Displaying the array
        for (byte i = 0; i < 10; i++) {
            System.out.println("Position ["+(i)+"] numbers["+numbers[i]+"]");
        }
    }
}
