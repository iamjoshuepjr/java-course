package javaObjectOrientedProgramming.exercises.abstractClasses.test;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.CommissionEmployee;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.HourlyEmployee;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.SalariedEmployee;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.SalaryPlusCommissionEmployee;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.employee.abstracts.Employee;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// Controller Class
public class EmployeeTest {
    public static void main(String[] args) {
        Employee salaried = new SalariedEmployee(123, "Karen", 5000);
        Employee hourly = new HourlyEmployee(124, "Dayanna", 30.8f, (byte) 40f);
        Employee commission = new CommissionEmployee(125, "Lucia", 400000f, 450f);
        Employee hourCommission = new SalaryPlusCommissionEmployee(126, "Luisa", 4890f, 500000f, 500f);

        Employee[] employees = {salaried, hourly, commission, hourCommission};

        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        float totalPayRoll = 0.0f;

        for (Employee e: employees) {
            e.payRollDetail();
            totalPayRoll += e.calculatePay();
        }
        String formattedTotalPayRoll = decimalFormat.format(totalPayRoll);
        JOptionPane.showMessageDialog(null, "TOTAL PAYROLL " +
                "\n$ " + formattedTotalPayRoll);
    }
}