package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.ifElse;

import javax.swing.JOptionPane;

public class MultipleOfTen {
    public static void main(String[] args) {
        var number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number here: "));

        if (number % 10 == 0){
            JOptionPane.showMessageDialog(null, "The number "+number+" is multiple of ten (10)");
        }else {
            JOptionPane.showMessageDialog(null, "The number "+number+" is not multiple of ten (10)");
        }
    }
}