package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class IntersperseOrder {
    public static void main(String[] args) {

        byte[] order = new byte[10];

        for (byte i = 0; i < order.length; i++) {
            order[i] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ("+(i+1)+") number here: "));
        }

        for (byte i = 0; i < (order.length/2); i++) {
            System.out.println(order[i]);
            System.out.println(order[order.length-1] - i);
        }
    }
}
