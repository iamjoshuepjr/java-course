package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class MoveElements3 {
    public static void main(String[] args) {
        /*
         * Ask for an array of 5 integers entered in increasing order.
         * These numbers must be stored in an array of 10 integers. Then ask for a number n and put it in the right place
         * so that the array looks neat.
         */

        // create array
        byte[] numbers = new byte[10];

        // auxiliaries variables
        byte aux = 0, position = 0, newNumber;
        boolean ascending = true;

        // filling array and validating its order
        do{
            // filling Array
            for (byte i = 0; i < 5; i++){
                numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] element from the  Array: "));
            }
            // checking order of the array
            for (byte i = 0; i < 4; i++){
                if (numbers[i] < numbers[i+1]){
                    ascending = true;
                }

                if (numbers[i] > numbers[i+1]){
                    ascending = false;
                    break;
                }
            }

            if (ascending == false){
                JOptionPane.showMessageDialog(null, "Warning!\nArray is not in increasing order. Enter numbers again.");
            }
        }while (ascending == false);

        // Asking for another number
        newNumber = Byte.parseByte(JOptionPane.showInputDialog("Enter another number here: "));

        // fixing array - Looking for position to the new number
        while ((numbers[aux] < newNumber) && (aux < 5)){
            position++;
            aux++;
        }

        for (byte i = 4; i >= position; i--) {
            numbers[i+1] = numbers[i];
        }

        // storing the number entered by the user
        numbers[position] = newNumber;

        JOptionPane.showMessageDialog(null, "Array");
        for (byte i = 0; i < 6; i++) {
            if(i < 5){
                System.out.print(numbers[i] + " - ");
            }
            else {
                System.out.print(numbers[i]);
            }
        }
    }
}
