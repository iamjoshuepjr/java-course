package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Student;

import javax.swing.*;

public class VirtualStudent extends Student {
    // Attributes
    private String virtualMeetingLink;
    private boolean hasComputer;

    // Constructor
    public VirtualStudent(int personId, String name, String phoneNumber, String email, int studentId, String gradeLevel, float GPA, String virtualMeetingLink, boolean hasComputer) {
        super(personId, name, phoneNumber, email, studentId, gradeLevel, GPA);
        this.virtualMeetingLink = virtualMeetingLink;
        this.hasComputer = hasComputer;
    }

    @Override
    public void study() {
        JOptionPane.showMessageDialog(null, "STUDY");
    }

    @Override
    public void submitAssignment() {
        JOptionPane.showMessageDialog(null, "SUBMIT ASSIGNMENTS");
    }

    @Override
    public void displayInformation() {
        JOptionPane.showMessageDialog(null, "VIRTUAL STUDENT INFORMATION\n" +
                "\n----------------------------------------" +
                "\nPerson ID: " + getPersonId() +
                "\nStudent ID: " + getStudentId() +
                "\nName: " + getName() +
                "\nEmail: " + getEmail() +
                "\n----------------------------------------" +
                "\nGrade Level: " + getGradeLevel() +
                "\nGPA: " + getGPA() +
                "\n----------------------------------------"
        );
    }
}