package javaFundamentals.controlStructures.decisionMaking.exercises.ifStatement.ifElse;

import javax.swing.JOptionPane;

public class WeeklySalary {
    public static void main(String[] args) {
        /*
        * 40- hours worked -> pay for hour: $30
        * 40+ hours worked -> pay for hour:
        * $30 for the first 40 hours
        * $40 for each extra hour
        * */

        float salary;

        // input
        var hoursWorked = Float.parseFloat(JOptionPane.showInputDialog("Enter your hours worked here: "));

        // process
        if(hoursWorked <= 40){
            salary = hoursWorked * 30;
        }else{
            salary = (40 * 30) + (hoursWorked - 40) * 40;
        }

        // output
        JOptionPane.showMessageDialog(null, "Your weekly salary is: $"+salary);
    }
}