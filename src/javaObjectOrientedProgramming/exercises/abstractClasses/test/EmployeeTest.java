package javaObjectOrientedProgramming.exercises.abstractClasses.test;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.*;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.abstracts.Employee;

import javax.swing.JOptionPane;

// Controller Class
public class EmployeeTest {
    public static void main(String[] args) {
        Employee salaried = new SalariedEmployee(123, "Karen", 5000);
        Employee hourly = new HourlyEmployee(124, "Dayanna", 30.8f, (byte) 40);
        Employee commission = new CommissionEmployee(125, "Lucia", 400000, 450);
        Employee hourCommission = new SalaryPlusCommissionEmployee(126, "Luisa", 4890, 500000, 500);

        Employee[] employees = {salaried, hourly, commission, hourCommission};

        int totalPayRoll = 0;
        for (Employee e: employees) {
            e.payRollDetail();
            totalPayRoll += e.calculatePay();
        }
        JOptionPane.showMessageDialog(null, "TOTAL PAYROLL " +
                "\n$ " + totalPayRoll);
    }
}