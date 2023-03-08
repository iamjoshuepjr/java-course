package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class Mixing2Arrays {
    public static void main(String[] args) {

        int[] array1, array2, array3;

        array1 = new int[5];
        array2 = new int[5];
        array3 = new int[10];

        // Asking for Array 1
        JOptionPane.showMessageDialog(null, "Array 1");
        for (byte i = 0; i <array1.length; i++) {
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the "+(i+1)+" element from Array 1: "));
        }

        // Asking for Array 2
        JOptionPane.showMessageDialog(null, "Array 2");
        for (byte i = 0; i <array2.length; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the "+(i+1)+" element from Array 2: "));
        }

        // Mixing Arrays
        byte j = 0;
        for (byte i = 0; i < 5; i++) {
            array3[j] = array1[i];
            j++;
            array3[j] = array2[i];
            j++;
        }

        JOptionPane.showMessageDialog(null, "Array 3");
        for (int element:array3) {
            System.out.println(element);
        }
        System.out.println("");
    }
}
