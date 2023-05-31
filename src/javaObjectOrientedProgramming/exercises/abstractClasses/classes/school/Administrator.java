package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Staff;

import javax.swing.*;

public class Administrator extends Staff {
    private String department;

    public Administrator(int personId, int staffId, String name, String phoneNumber, String email, String department) {
        super(personId, staffId, name, phoneNumber, email);
        this.department = department;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        JOptionPane.showMessageDialog(null, "ADMINISTRATOR WORKING" +
                "\nAdministrator Department: " + getDepartment());
    }

    @Override
    public void displayInformation() {
        JOptionPane.showMessageDialog(null, "TEACHER INFORMATION\n" +
                "\n----------------------------------------" +
                "\nPerson ID: " + getPersonId() +
                "\nStaff ID: " + getStaffId() +
                "\nName: " + getName() +
                "\nEmail: " + getEmail() +
                "\n----------------------------------------" +
                "\nDepartment: " + getDepartment()
        );
    }
}
