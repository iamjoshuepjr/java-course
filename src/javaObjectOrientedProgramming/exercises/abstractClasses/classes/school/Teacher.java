package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Staff;

import javax.swing.JOptionPane;

public class Teacher extends Staff {
    private String specialization;
    private String subject;

    // Constructor
    public Teacher(int personId, int staffId, String name, String phoneNumber, String email, String specialization, String subject) {
        super(personId, staffId, name, phoneNumber, email);
        this.specialization = specialization;
        this.subject = subject;
    }

    // Getters
    public String getSpecialization() {
        return specialization;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void work() {
        JOptionPane.showMessageDialog(null, "TEACHER WORKING" +
                "\nTeaching Subject: " + getSubject());
    }

    public void gradeAssignment(){
        JOptionPane.showMessageDialog(null, "TEACHER IS GRADING ASSIGNMENTS");
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
                "\nSpecialization: " + getSpecialization() +
                "\nSubject: " + getSubject()
        );
    }
}