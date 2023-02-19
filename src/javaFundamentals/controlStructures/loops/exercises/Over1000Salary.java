package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class Over1000Salary {
    public static void main(String[] args) {
        /* Ask for 10 salaries and show the sum of all of them, and how many over 1000 there are.  */

        float sum = 0;
        byte salaryCounter = 0;

        for (int i = 1; i < 11; i++) {
            var salary = Float.parseFloat(JOptionPane.showInputDialog("Enter the salary ("+i+") here: $"));
            sum += salary;

            if(salary > 1000){
                salaryCounter++;
            }
        }
        JOptionPane.showMessageDialog(null, "Sum of Salaries: $"+sum
        + "\nOver $1000: ("+salaryCounter+")");
    }
}
