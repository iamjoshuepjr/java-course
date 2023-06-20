package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.ifElse;

import javax.swing.JOptionPane;

public class GradingScales {
    public static void main(String[] args) {

        // Input
        var grade = Float.parseFloat(JOptionPane.showInputDialog("Enter your grade here: "));

        // Process and output

        if((grade < 0) || (grade > 5)) {
            JOptionPane.showMessageDialog(null, "Waring!\nEnter a valid grade!");
        } else if (grade >= 4){
            JOptionPane.showMessageDialog(null, "Your grade ("+grade+") represents A");
        } else if ((grade >= 3) && (grade < 4)) {
            JOptionPane.showMessageDialog(null, "Your grade ("+grade+") represents B");
        } else if ((grade >= 2) && (grade < 3)) {
               JOptionPane.showMessageDialog(null, "Your grade ("+grade+") represents C");
        } else if ((grade >= 1) && (grade < 2)) {
            JOptionPane.showMessageDialog(null, "Your grade ("+grade+") represents D");
        } else {
            JOptionPane.showMessageDialog(null, "Your grade ("+grade+") represents F");
        }
    }
}