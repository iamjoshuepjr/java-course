package javaObjectOrientedProgramming.exercises.test;
import javaObjectOrientedProgramming.exercises.classes.Student;
import javax.swing.JOptionPane;

// Controller Class
public class StudentTest {
    public static void main(String[] args) {
        byte numberStudents = Byte.parseByte(JOptionPane.showInputDialog("How many students do you want to store?"));

        // Creating a Student array
        Student[] students = new Student[numberStudents];

        // Attributes to fill
        String name, lastname;
        float[] grades = new float[3];

        // Instantiating each object
        for (int i = 0; i < students.length; i++) {
            JOptionPane.showMessageDialog(null, "Student "+(i+1));
            name = JOptionPane.showInputDialog("Enter the name of the Student");
            lastname = JOptionPane.showInputDialog("Enter the last name of the Student");

            for (int j = 0; j < grades.length; j++) {
                grades[j] = Float.parseFloat(JOptionPane.showInputDialog("Enter the grade ["+(j+1)+"] of the ["+(i+1)+"] Student"));
            }

            // Instantiating each object
            students[i] = new Student(name, lastname, grades);

            JOptionPane.showMessageDialog(null, "Final grade " +
                    "Student: " + students[i].fullName()+ " grade: " + students[i].finalGrade(grades));
        }
    }
}