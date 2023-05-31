package javaObjectOrientedProgramming.exercises.abstractClasses.test;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.InPersonStudent;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.Teacher;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Staff;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts.Student;

// Controller Class
public class SchoolTest {
    public static void main(String[] args) {
        // Polymorphism between classes
        Student student = new InPersonStudent(
                123,
                "Lilith",
                "1 (205) 719-2406",
                "lilith@example.com",
                1234567890,
                "Junior",
                4.5f,
                "406-f",
                "24"
        );

        student.displayInformation();
        student.study();
        student.submitAssignment();

        Staff teacher = new Teacher(
                123,
                12345,
                "Jennifer",
                "1 (206) 919-8403",
                "jennifer@example.com",
                "Computer Science",
                "Programming"
        );

        teacher.work();
        teacher.displayInformation();
        ((Teacher) teacher).gradeAssignment();

    }
}