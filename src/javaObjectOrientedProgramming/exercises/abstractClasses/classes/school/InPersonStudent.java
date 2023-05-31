package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Student;

import javax.swing.JOptionPane;

public class InPersonStudent extends Student {
    // Attributes
    private String classroom;
    private String schoolBusNumber;

    // Constructor
    public InPersonStudent(int personId, String name, String phoneNumber, String email, int studentId, String gradeLevel, float GPA, String classroom, String schoolBusNumber) {
        super(personId, name, phoneNumber, email, studentId, gradeLevel, GPA);
        this.classroom = classroom;
        this.schoolBusNumber = schoolBusNumber;
    }

    // Getters
    public String getClassroom() {
        return classroom;
    }

    public String getSchoolBusNumber() {
        return schoolBusNumber;
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
        JOptionPane.showMessageDialog(null, "IN-PERSON STUDENT INFORMATION\n" +
                "\n----------------------------------------" +
                "\nPerson ID: " + getPersonId() +
                "\nStudent ID: " + getStudentId() +
                "\nName: " + getName() +
                "\nEmail: " + getEmail() +
                "\n----------------------------------------" +
                "\nGrade Level: " + getGradeLevel() +
                "\nClassroom: " + getClassroom() +
                "\nSchool Bus N°: " + getSchoolBusNumber() +
                "\nGPA: " + getGPA() +
                "\n----------------------------------------"
        );
    }
}
