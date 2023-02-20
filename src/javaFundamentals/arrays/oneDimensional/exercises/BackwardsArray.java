package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class BackwardsArray {
    public static void main(String[] args) {

        byte[] numbers = new byte[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+" number here: "));
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number: "+numbers[i]);
        }
    }
}
