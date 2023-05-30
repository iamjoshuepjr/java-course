package javaObjectOrientedProgramming.exercises.abstractClasses.classes.abstracts;

import javax.swing.JOptionPane;

// Superclass
// Object Class
public abstract class Employee {
    // Attributes
    private int employeeId;
    private String name;

    // Constructor
    public Employee(int employeeId, String name){
        this.employeeId = employeeId;
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
        JOptionPane.showMessageDialog(null, "PAYROLL DETAIL" +
                "\nEmployee ID: " + getIdEmployee() +
                "\nEmployee Name: " + name +
                "\nTotal Earnings: $ " + calculatePay());
    }
}