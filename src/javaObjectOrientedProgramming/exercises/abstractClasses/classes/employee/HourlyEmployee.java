package javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.abstracts.Employee;

public class HourlyEmployee extends Employee {
    // Attributes
    private float hourWage;
    private byte hourWorked;

    public HourlyEmployee(int employeeId, String name, float hourWage, byte hourWorked) {
        super(employeeId, name);
        this.hourWage = hourWage;
        this.hourWorked = hourWorked;
    }

    @Override
    public float calculatePay() {
        if(hourWorked <= 40){
            return hourWorked * hourWage;
        }
        else {
            byte overtime = (byte) (hourWorked - 40);
            float overtimePay = overtime * (hourWorked * 2.6f);
            return (hourWorked * 40) + overtimePay;
        }
    }
}