package javaObjectOrientedProgramming.exercises.inheritance.classes.employee;

/**
 * We need an application that allows calculating the salary of employees in a company.
 * The company has two types of employees:
 * - basic employees who are paid a salary based on the hours worked during the month, and
 * - commission-based employees who receive an additional commission based on the sales made in the month.
 * Create the required UML design and a main class where multiple employees are instantiated, and their salaries are calculated.
 */

// Superclass
// Object Class
public class Employee {
    // Attributes
    private int employeeId;
    private String name;

    // Constructor
    public Employee(int employeeId, String name){
        this.employeeId = employeeId;
        this.name = name;
    }

    // Getters and Setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public float calculateSalary(){
        return 0.0F;
    }
}