package javaObjectOrientedProgramming.exercises.abstractClasses.classes;

public class SalaryPlusCommissionEmployee extends CommissionEmployee{
    // Attributes
    private float salary;

    public SalaryPlusCommissionEmployee(int employeeId, String name, float salary, float salesMade, float commissionRate) {
        super(employeeId, name, salesMade, commissionRate);
        this.salary = salary;
    }

    // Getters
    public float getSalary() {
        return salary;
    }

    @Override
    public float calculatePay() {
        return super.calculatePay() + getSalary();
    }
}
