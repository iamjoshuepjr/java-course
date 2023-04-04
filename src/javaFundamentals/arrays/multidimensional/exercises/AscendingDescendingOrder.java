package javaFundamentals.arrays.multidimensional.exercises;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class AscendingDescendingOrder {
    public static void main(String[] args) {
        boolean ascending = false, descending = false;

        // create a 2D array
        byte[][] array = new byte[2][5];
        JOptionPane.showMessageDialog(null, "Filling the Array");

        // filling array
        for (byte i = 0; i < array.length; i++){
            for (byte j = 0; j < array[i].length; j++) {
                array[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] element from the Array"));
            }
        }

        // checking oder
        for (byte i = 0; i < array.length - 1; i++){
            for (byte j = 0; j < array[i].length - 1; j++) {
                if(array[i][j] < array[i+1][j+1]){
                    ascending = true;
                }

                if(array[i][j] > array[i+1][j+1]){
                    descending = true;
                }
            }
        }

        if ((ascending == true) && (descending == false)){
            JOptionPane.showMessageDialog(null, "The Array's elements are in Ascending Order!");
        } else if ((ascending == false) && (descending == true)) {
            JOptionPane.showMessageDialog(null, "The Array's elements are in Descending Order!");
        } else if ((ascending == true) && (descending == true)) {
            JOptionPane.showMessageDialog(null, "The Array's elements are Unordered!");
        } else if ((ascending == false) && (descending == false)) {
            JOptionPane.showMessageDialog(null, "The Array's elements are Equals!");
        }

        System.out.println("2D Array");
        for (byte i = 0; i < array.length; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] +  " ");
            }
            System.out.println();
        }
    }
}
