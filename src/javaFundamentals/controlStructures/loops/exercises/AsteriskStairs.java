package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.*;

public class AsteriskStairs {
    public static void main(String[] args) {
        int height = Integer.parseInt(JOptionPane.showInputDialog("Stairs Height: "));

        for (int asterisk = 1; asterisk <= height; asterisk++){
            for (int j = 0; j < asterisk; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}