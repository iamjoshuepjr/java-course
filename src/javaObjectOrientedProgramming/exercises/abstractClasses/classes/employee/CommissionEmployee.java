package javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.abstracts.Employee;

public class CommissionEmployee extends Employee {
    // Attributes
    private float salesMade;
    private float commissionRate;

    // Constructor
    public CommissionEmployee(int employeeId, String name, float salesMade, float commissionRate) {
        super(employeeId, name);
        this.salesMade = salesMade;
        this.commissionRate = commissionRate;
    }

    // Getters
    public float getSalesMade() {
        return salesMade;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    @Override
    public float calculatePay() {
        return getSalesMade() * getCommissionRate();
    }
}