package javaFundamentals.arrays.oneDimensional.sorting;

import javax.swing.JOptionPane;

public class SequentialSearch {
    public static void main(String[] args) {
        /**
         * ==========================================================
         *                       Sequential Search
         *  Sequential search, also known as linear search,
         *  is a simple algorithm used to search for an element
         *  in a list or an array.
         *  The algorithm works by iterating through the list or array,
         *  and comparing each element with the target element
         *  until a match is found or the end of the list is reached.
         *  */

        // create array
        byte[] numbers = new byte[10];
        byte aux, position;
        boolean found = false;

        // ask for the number of elements to save

        byte elements = Byte.parseByte(JOptionPane.showInputDialog(
                "Enter the number of elements you want store (from 2 - 10). + " +
                "\n(Numbers must not be greater than 127 nor less than -128)"));

        for (byte i = 0; i < elements ; i++) {
            numbers[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+(i+1)+"] number. "));
        }

        //ask for a number to search for in the list
        byte search = Byte.parseByte(JOptionPane.showInputDialog("Enter the number you want to search for in the list. "));

        // sequential search
        byte i = 0;
        while ((i < elements) && (found == false)){
            if(numbers[i] == search){
                found = true;
            }
            i++;
        }
        if(found == false){
            JOptionPane.showMessageDialog(null, "Number ["+search+"] is not at the array");
        }else {
            JOptionPane.showMessageDialog(null, "Number ["+search+"] is at the array index ["+(i-1)+"]");
        }

        System.out.print("List = [");
        for (byte j = 0; j < elements; j++) {
            if(j < elements -1){
                System.out.print(numbers[j]+ ", ");
            }
            else {
                System.out.print(numbers[j] + "]");
            }
        }
    }
}