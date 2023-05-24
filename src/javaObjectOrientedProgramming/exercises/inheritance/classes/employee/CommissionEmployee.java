package javaObjectOrientedProgramming.exercises.inheritance.classes.employee;

// Subclass
// Object Class
public class CommissionEmployee extends Employee {
    // Own Attributes
    private float salesMade;
    private float commissionRate;

    // Constructor
    public CommissionEmployee(int employeeId, String name, float salesMade, float commissionRate){
        super(employeeId, name);
        this.salesMade = salesMade;
        this.commissionRate = commissionRate;
    }

    // Getter and Setters

    public float getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(float salesMade) {
        this.salesMade = salesMade;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float commission(){
        return salesMade * commissionRate;
    }
    @Override
    public float calculateSalary() {
        return super.calculateSalary() + commission();
    }
}