package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class Product10FirstOddNumbers {
    public static void main(String[] args) {
        var mult = 1;

        for (int i = 1; i < 20; i+=2) {
            if(i % 2 == 1){
                mult *= i;
            }
        }
        JOptionPane.showMessageDialog(null,  "Multiplication: "+mult);
    }
}
