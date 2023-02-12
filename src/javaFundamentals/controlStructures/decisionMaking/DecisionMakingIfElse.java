package javaFundamentals.controlStructures.decisionMaking;
import javax.swing.JOptionPane;

public class DecisionMakingIfElse {
    public static void main(String[] args) {
        /* An else statement to specify a block of code to be executed
         * when the boolean expression is false */
        JOptionPane.showMessageDialog(null, "Start");
        var age = Byte.parseByte(JOptionPane.showInputDialog("Enter your age here: "));

        JOptionPane.showMessageDialog(null, "Normal Flow");
        JOptionPane.showMessageDialog(null, "Evaluating condition...");

        // if a certain condition is true then a block of statements is executed otherwise not
        if(age >= 18)
        {
            JOptionPane.showMessageDialog(null, "Because age is: " + age);
            JOptionPane.showMessageDialog(null, "I'm in if-statement!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Because age is: " + age);
            JOptionPane.showMessageDialog(null, "I'm in else-statement!");
        }
        JOptionPane.showMessageDialog(null, "Normal Flow");
        JOptionPane.showMessageDialog(null, "End");
    }
}
