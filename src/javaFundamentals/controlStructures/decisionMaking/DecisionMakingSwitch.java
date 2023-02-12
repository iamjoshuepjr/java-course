package javaFundamentals.controlStructures.decisionMaking;
import javax.swing.JOptionPane;

public class DecisionMakingSwitch {
    public static void main(String[] args) {

        /*
        * The switch statement allows us to execute
        * a block of code among many alternatives.
        * The expression is evaluated once and compared with the values of each case.
        * If expression matches with value1, the code of case value1 are executed. Similarly, the code of case value2 is executed if expression matches with value2.
        * If there is no match, the code of the default case is executed.
        */

        var day = Byte.parseByte(JOptionPane.showInputDialog("Enter the number of the a week day (1 - 7): "));

        switch (day) {
            case 1:
                JOptionPane.showMessageDialog(null, "Monday");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Tuesday");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Wednesday");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Thursday");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Friday");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Saturday");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sunday");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Days of week are 7!");
        }

    }
}
