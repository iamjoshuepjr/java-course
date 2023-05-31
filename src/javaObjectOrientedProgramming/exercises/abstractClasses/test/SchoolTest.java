package javaObjectOrientedProgramming.exercises.abstractClasses.test;

import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.Administrator;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.InPersonStudent;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.Teacher;
import javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.VirtualStudent;
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

        Student virtualStudent = new VirtualStudent(
                124,
                "Jezebeth",
                "1 (205) 719-2406",
                "jezebeth@example.com",
                1234567890,
                "Junior",
                4.5f,
                "https://mettinglink.plaform.com",
                true
        );

        virtualStudent.study();
        virtualStudent.submitAssignment();
        virtualStudent.displayInformation();

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

        Staff admnin = new Administrator(
                134,
                13445,
                "Andrea",
                "1 (206) 919-8403",
                "andrea@example.com",
                "Computer Science"
        );

        admnin.work();
        admnin.displayInformation();
    }
}