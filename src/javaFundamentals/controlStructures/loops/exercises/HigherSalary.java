package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class HigherSalary {
    public static void main(String[] args) {

        byte number =  Byte.parseByte(JOptionPane.showInputDialog("Enter the number of salaries you want to manage: "));
        float higherSalary = 0;

        for (int i = 1; i <= number ; i++) {
            var salary = Float.parseFloat(JOptionPane.showInputDialog("Enter the salary ("+i+") $ "));
            if(salary > higherSalary){
                higherSalary = salary;
            }
        }
        JOptionPane.showMessageDialog(null, "Higher Salary: $"+higherSalary);
    }
}
