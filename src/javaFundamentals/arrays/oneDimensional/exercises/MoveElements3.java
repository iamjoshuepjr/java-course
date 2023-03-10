package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class MoveElements3 {
    public static void main(String[] args) {
        // create array
        byte[] numbers = new byte[10];

        // auxiliary variable
        byte aux = 0, position = 0, newNumber;
        boolean ascending = true;

        // filling Array
        do{
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
                JOptionPane.showMessageDialog(null, "Warning!\nArray is not in ascending order. Enter numbers again.");
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
