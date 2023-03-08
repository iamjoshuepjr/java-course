package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class AscendingDescendingOrder {
    public static void main(String[] args) {
        boolean ascending = false, descending = false;

        // creating array
        byte[] array = new byte[10];
        JOptionPane.showMessageDialog(null, "Filling the Array");

        // filling array
        for (int i = 0; i < array.length ; i++) {
            array[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+") element from the Array"));
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) { // ascending: 1 - 2 - 3 - 4
                ascending = true;
            }

            if (array[i] > array[i + 1]) { // descending: 5 - 4 - 3 - 2
                descending = true;
            }
        }

        if((ascending == true) && (descending == false)){
            JOptionPane.showMessageDialog(null, "The Array's elements are in Ascending Order!");
        }
        else if ((ascending == false) && (descending == true)) {
            JOptionPane.showMessageDialog(null, "The Array's elements are in Descending Order!");
        }
        else if ((ascending == true) && (descending == true)){
            JOptionPane.showMessageDialog(null, "The Array's elements are Unordered!");
        }
        else if ((ascending == false) && (descending == false)){
            JOptionPane.showMessageDialog(null, "The Array's elements are Equals!");
        }
    }
}
