package javaObjectOrientedProgramming.exercises.createClasses.test;

import javaObjectOrientedProgramming.exercises.createClasses.classes.Worker;

import javax.swing.*;

// Controller class
public class WorkerTest {
    public static void main(String[] args) {
        // Instantiating 2 Worker objects
        Worker worker1 = new Worker("Joshuép Jr.", 35.7f);
        float hoursWorked1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the hours worked for the first worker"));

        JOptionPane.showMessageDialog(null, "Worker Salary" +
                "\nName: " + worker1.getName() +
                "\nSalary $" +worker1.salary(hoursWorked1));

        Worker worker2 = new Worker("Jane.", 35.7f);
        float hoursWorked2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the hours worked for the second worker"));

        JOptionPane.showMessageDialog(null, "Worker Salary" +
                "\nName: " + worker2.getName() +
                "\nSalary $" +worker2.salary(hoursWorked2));

        // Modifying the hourly rate
        worker1.setHourRate(45.0f);
        worker2.setHourRate(45.0f);

        // Recalculating the salaries
        JOptionPane.showMessageDialog(null, "Worker Salary" +
                "\nName: " + worker1.getName() +
                "\nSalary $" +worker1.salary(hoursWorked1) +
                "\nName: " + worker2.getName() +
                "\nSalary $" +worker2.salary(hoursWorked2));
    }
}