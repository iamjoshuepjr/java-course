package javaFundamentals.arrays.oneDimensional.sorting;

import javax.swing.*;

public class InsertionSort {
    public static void main(String[] args) {
        /**
         * =====================================================================================================
         *                                        Insertion Sort
         *  Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
         *  It works by iterating through an array of unsorted items, removing one item at a time,
         *  and inserting it into the correct position in the sorted sub-array.
         *  How bubble sort works:
         *  1. Start with an unsorted list of elements.
         *  2. Iterate through each element in the list, staring from the second element.
         *  3. Compare the current element with the element to its left in the stored sub-array,
         *  and shift them to the right if they are greater than the current element.
         *  4. Insert the current element into its correct position in the sorted sub-array.
         *  continuing until the end of the list is reached.
         *  5. Repeat steps 2 - 4 for each element in the list until all elements are sorted.
         *
         *  The time complexity of bubble sort is O(n^2) in the worst case. However, it performs well on
         *  small arrays or nearly sorted arrays with a time complexity of O(n) in the best case.
         *  */

        // create array
        byte[] numbers = new byte[10];
        byte position = 0, current = 0, count = 0;

        // ask for the number of elements to save
        byte elements = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of elements you want enter (from 2 - 10). "));

        for (byte i = 0; i < elements ; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] number. "));
        }

        // insertion sort
        for (byte i = 0; i < elements ; i++) {
            position = i;
            current = numbers[i];

            while ((position > 0) && (numbers[position-1] > current)){
                numbers[position] = numbers[position - 1];
                position--;
            }
            numbers[position] = current;
        }

        // displaying array
        JOptionPane.showMessageDialog(null, "The Array's elements are in Ascending Order!");
        System.out.print("Ascending Order: [");
        for (byte i = 0; i < elements; i++) {
            count++;
            if(i < elements - 1){
                System.out.print(+ numbers[i]+", ");
            }else {
                System.out.print(numbers[i]+ "]\n");
            }

        }
        JOptionPane.showMessageDialog(null, "Sorted Successfully in ["+count+"] times!");

        JOptionPane.showMessageDialog(null, "The Array's elements are in Descending Order!");
        System.out.print("Descending Order: [");
        for (byte i = (byte) (elements - 1); i >= 0; i--) {
            count++;
            if(i > 0){
                System.out.print(numbers[i]+", ");
            }else {
                System.out.print(numbers[i]+ "]");
            }
        }
    }
}
