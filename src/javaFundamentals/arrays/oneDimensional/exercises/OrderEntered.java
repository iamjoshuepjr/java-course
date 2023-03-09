package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class OrderEntered {
    public static void main(String[] args) {

        // creating array
        byte[] numbers = new byte[5];

        // filling array
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the "+(i+1)+" number here: "));
        }
        // displaying array order entered
        System.out.println("Order Entered: ");
        for (byte number:numbers) {
            System.out.println("Number: " + number);
        }
    }
}
