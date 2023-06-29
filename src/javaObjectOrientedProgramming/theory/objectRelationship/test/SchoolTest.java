package javaObjectOrientedProgramming.theory.objectRelationship.test;

import javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.school.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SchoolTest {

    public static void displayStudent(ArrayList<Student> students){
        for (Student student: students) {
            JOptionPane.showMessageDialog(null, "Student Information\n" +
                    student);
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("000001", "Joshuép Jr.");
        Student student2 = new Student("00002", "Jessenia");

        Course coding = new Course("java-code-2023", "Java Development");
        Course english = new Course("english-2023", "English");
        Course leadership = new Course("lead-2023", "Leadership");
        Course training = new Course("per-training-2023", "Personal Training");

        ArrayList<Course> student1Courses = new ArrayList<>();
        student1Courses.add(coding);
        student1Courses.add(english);

        ArrayList<Course> student2Courses = new ArrayList<>();
        student2Courses.add(leadership);
        student2Courses.add(training);

        student1.setCourses(student1Courses);
        student2.setCourses(student2Courses);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        displayStudent(students);
    }
}
