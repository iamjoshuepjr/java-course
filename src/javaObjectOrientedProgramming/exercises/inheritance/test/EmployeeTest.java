package javaObjectOrientedProgramming.exercises.inheritance.test;
import javaObjectOrientedProgramming.exercises.inheritance.classes.employee.BasicEmployee;
import javaObjectOrientedProgramming.exercises.inheritance.classes.employee.CommissionEmployee;

import javax.swing.JOptionPane;

// Controller Class
public class EmployeeTest {
    public static void displayInfo(Object object){
        if(object instanceof BasicEmployee){
            BasicEmployee basic = (BasicEmployee) object;
            JOptionPane.showMessageDialog(null, "BASIC EMPLOYEE INFORMATION" +
                    "\nName: " + basic.getName() +
                    "\nWorked Hours: " + basic.getHoursWorked() +
                    "\nHourly Rate: USD$ " + basic.getHourlyRate() +
                    "\n----------------------------" +
                    "\nSalary: USD$ " +basic.calculateSalary());
        } else if (object instanceof CommissionEmployee) {
            CommissionEmployee commission = (CommissionEmployee) object;
            JOptionPane.showMessageDialog(null, "COMMISSION EMPLOYEE INFORMATION" +
                    "\nName: " + commission.getName() +
                    "\nSales made USD$ " + commission.getSalesMade() +
                    "\nCommission Rate: USD$ " + commission.getCommissionRate() +
                    "\n----------------------------" +
                    "\nSalary: USD$ " +commission.calculateSalary());
        }
    }

    public static void main(String[] args) {
        BasicEmployee basic = new BasicEmployee(10001, "Karen", 40, 34f);
        displayInfo(basic);

        CommissionEmployee commission = new CommissionEmployee(10002, "Dayanna", 4000f, 340f);
        displayInfo(commission);
    }
}