package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class EvenAndOdd {
    public static void main(String[] args) {
        // create array
        byte[] numbers = new byte[10];
        byte evenCounter = 0, oddCounter = 0;

        // filling array
        for (byte i = 0; i < 10 ; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element of the Array: "));
            if(numbers[i] % 2 == 0){
                evenCounter++;
            }else {
                oddCounter++;
            }
        }

        // create two arrays, one to even and one to odd
        byte[] odd = new byte[oddCounter];
        byte[] even = new byte[evenCounter];

        // iterators
        byte evenIterator = 0, oddIterator = 0;

        // storing even and odd numbers on the corresponding array
        for(byte i = 0; i < 10; i++){
            if(numbers[i] % 2 == 0){
                even[evenIterator] = numbers[i]; // even array
                evenIterator++;
            }else {
                odd[oddIterator] = numbers[i]; // odd array
                oddIterator++;
            }
        }

        JOptionPane.showMessageDialog(null, "Even Array");
        for (byte i = 0; i < evenCounter; i++) {
            if(i < (evenCounter - 1)){
                System.out.print(even[i] + ", ");
            }else {
                System.out.print(even[i] + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, "Odd Array");
        for (byte i = 0; i < oddCounter; i++) {
            if(i < (oddCounter - 1)){
                System.out.print(odd[i] + ", ");
            }else {
                System.out.print(odd[i]);
            }
        }
    }
}
