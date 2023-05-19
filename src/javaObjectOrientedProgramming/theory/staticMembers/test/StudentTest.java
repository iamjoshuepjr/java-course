package javaObjectOrientedProgramming.theory.staticMembers.test;

import javaObjectOrientedProgramming.theory.staticMembers.classes.Student;
import javax.swing.JOptionPane;

public class StudentTest {
    public static void main(String[] args) {
        // Accessing static method via class name
        JOptionPane.showMessageDialog(null, "Welcome to " +Student.getUniversityName()); // static method

        // Instantiate Student objects
        Student student1 = new Student("Karen");
        Student student2 = new Student("Dayanna");

        // Accessing static and instance methods
        JOptionPane.showMessageDialog(null, "Student Information" +
                "\nStudent: " + student1.getName() + // instance method
                "\nStudent ID: " +student1.getStudentId() + // instance method
                "\nUniversity: " +Student.getUniversityName()); // static method

        // Updating University name
        Student.setUniversityName("CDF University"); // static method

        JOptionPane.showMessageDialog(null, "Student Information" +
                "\nStudent: " + student2.getName() +
                "\nStudent ID: " +student2.getStudentId() +
                "\nUniversity: " +Student.getUniversityName());
    }
}
