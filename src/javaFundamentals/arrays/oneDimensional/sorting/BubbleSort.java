package javaFundamentals.arrays.oneDimensional.sorting;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * ==========================================================
         *                       Bubble Sort
         *  Bubble Sort is a simple algorithm that repeatedly steps
         *  through the list to be sorted, compares adjacent elements
         *  and swaps them if they are in the wrong order.
         *  How bubble sort works:
         *  1. Start with an unsorted list of elements.
         *  2. Compare the first element with the second element.
         *  3. If the first element is greater than the second element, swap them.
         *  4. Move to the next pair of elements, and repeat steps 2 - 3,
         *  continuing until the end of the list is reached.
         *  5. Repeat steps 2 - 4 for each element in the list. until no more swaps are needed
         *  (i.e., the list is sorted).
         *  The time complexity of bubble sort is O(n^2) in the worst case.
         *  */

        // create array
        byte[] numbers = new byte[10];
        byte aux;

        // ask for the number of elements to save
        byte elements = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want enter (from 2 - 10). "));

        for (byte i = 0; i < elements ; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] number. "));
        }

        // bubble sort
        for (byte i = 0; i < elements - 1; i++) { // number of loop
            for (int j = 0; j < elements - 1; j++) { // sorting the array
                if(numbers[j] > numbers[j+1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }

        // displaying array
        JOptionPane.showMessageDialog(null, "The Array's elements are in Ascending Order!");
        for (byte i = 0; i < elements; i++) {
            if(i < elements - 1){
                System.out.print(numbers[i]+", ");
            }else {
                System.out.print(numbers[i]+ "\n");
            }

        }

        JOptionPane.showMessageDialog(null, "The Array's elements are in Descending Order!");
        for (byte i = (byte) (elements - 1); i >= 0; i--) {
            if(i > 0){
                System.out.print(numbers[i]+", ");
            }else {
                System.out.print(numbers[i]);
            }
        }
    }
}
