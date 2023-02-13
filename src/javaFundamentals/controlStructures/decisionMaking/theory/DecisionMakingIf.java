package javaFundamentals.controlStructures.decisionMaking.theory;
import javax.swing.JOptionPane;

public class DecisionMakingIf {
    public static void main(String[] args) {
        /*
        simple if decision-making
        The most simple decision-making statement.
        It's used to decide whether a certain statement or block of statement will be executed or not.
        */

        var age = Byte.parseByte(JOptionPane.showInputDialog("Enter your age here: "));

        JOptionPane.showMessageDialog(null, "Normal Flow");
        JOptionPane.showMessageDialog(null, "Evaluating condition...");

        // if a certain condition is true then a block of statements is executed otherwise not
        if(age >= 18)
        {
            JOptionPane.showMessageDialog(null, "Because age is: " + age);
            JOptionPane.showMessageDialog(null, "I'm in if-statement!");
        }

        JOptionPane.showMessageDialog(null, "Normal Flow");
    }
}
