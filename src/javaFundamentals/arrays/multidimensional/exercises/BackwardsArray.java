package javaFundamentals.arrays.multidimensional.exercises;

import javax.swing.*;

public class BackwardsArray {
    public static void main(String[] args) {
     byte[][] numbers = new byte[2][5];

        for (byte i = 0; i < numbers.length; i++) {
            for (byte j = 0; j <numbers[i].length; j++) {
                numbers[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Enter the ["+i+"]["+j+"] number here: "));
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers[i].length - 1; j >= 0; j--) {
                System.out.print("[");
                if(j > 0){
                    System.out.print(numbers[i][j] + "], ");
                } else {
                    System.out.print(numbers[i][j] + "]");
                }
            }
            System.out.println();
        }
    }
}
