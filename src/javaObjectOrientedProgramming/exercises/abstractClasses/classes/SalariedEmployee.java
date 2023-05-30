package javaObjectOrientedProgramming.exercises.abstractClasses.classes;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.abstracts.Employee;

// Subclass
// Object Class
public class SalariedEmployee extends Employee {
    // Attributes
    private float salary;

    // Constructor
    public SalariedEmployee(int employeeId, String name, float salary) {
        super(employeeId, name);
        this.salary = salary;
    }

    // Getter
    public float getSalary() {
        return salary;
    }

    @Override
    public float calculatePay() {
        return getSalary();
    }
}
