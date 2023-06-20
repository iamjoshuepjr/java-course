package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.IfElse;

import javax.swing.JOptionPane;

public class VerifyUppercase {
    public static void main(String[] args) {
        /* Ask for a letter and determinate if is an upper- or lowercase*/

        var letter = JOptionPane.showInputDialog("Enter a letter here: ").charAt(0);

        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "The letter ("+letter+") is an uppercase!");
        }else {
            JOptionPane.showMessageDialog(null, "The letter ("+letter+") is an lowercase!");
        }
    }
}