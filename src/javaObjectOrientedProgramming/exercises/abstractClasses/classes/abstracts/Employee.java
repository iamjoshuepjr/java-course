package javaObjectOrientedProgramming.exercises.abstractClasses.classes.abstracts;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// Superclass
// Object Class
public abstract class Employee {
    // Attributes
    private int employeeId;
    private String name;

    // Constructor
    public Employee(int employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    // Getters
    public int getIdEmployee() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract Methods
    public abstract float calculatePay();

    public void payRollDetail(){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        String formattedEarnings = decimalFormat.format(calculatePay());

        JOptionPane.showMessageDialog(null, "PAYROLL DETAIL" +
                "\nEmployee ID: " + getIdEmployee() +
                "\nEmployee Name: " + getName() +
                "\nTotal Earnings: $ " + formattedEarnings);
    }
}