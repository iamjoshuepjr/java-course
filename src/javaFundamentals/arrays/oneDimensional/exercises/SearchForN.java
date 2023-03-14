package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class SearchForN {
    public static void main(String[] args) {
        /**
         * Ask for an array of 10 integers (must be in ascending order)
         * Ask for a number n and search for it.
         * If n is in array display its position, else display a message
         * */

        // array
        byte[] numbers = new byte[10];

        // auxiliaries variables
        byte search;
        boolean ascending = true;

        // filling array and validating its order
        do {
            JOptionPane.showMessageDialog(null, "ARRAY 1");
            for(byte i = 0; i < numbers.length; i++){
                numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element of the array 1: "));
            }

            // checking order of the array
            for (byte i = 0; i < 9; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    ascending = true;
                }

                if (numbers[i] > numbers[i + 1]) {
                    ascending = false;
                    break;
                }
            }

            if (ascending == false){
                JOptionPane.showMessageDialog(null, "Warning!\nArray is not in increasing order. Enter numbers again.");
            }

        }while (ascending == false);

        // Asking for another number
        search = Byte.parseByte(JOptionPane.showInputDialog("Enter the number you want to find here: "));

        byte i = 0;
        while ((i < numbers.length) && (numbers[i] < search)) {
            i++;
        }

        if(i == 10){
            JOptionPane.showMessageDialog(null, "The number is not at Array!");

        }
        else {
            if(numbers[i] == search){
                JOptionPane.showMessageDialog(null, "The number ["+search+"] was found at ["+i+"] position.");
            }
            else {
                JOptionPane.showMessageDialog(null, "The number is not at Array!");
            }
        }
    }
}