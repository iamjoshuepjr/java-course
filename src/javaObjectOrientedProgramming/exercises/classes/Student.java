package javaObjectOrientedProgramming.exercises.classes;

/**
 * Create a class that allows calculating the final grade of a student.
 * Create multiple student objects and calculate their final grades.
 */

// Object Class
public class Student {
    private String name;
    private String lastname;
    private float[] grades = new float[3];

    public Student(String name, String lastname, float[] grades) {
        this.name = name;
        this.lastname = lastname;
        this.grades = grades;
    }

    public String fullName(){
        return name + " " + lastname;
    }

    public float finalGrade(float[] grades){
        float grade = 0, sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum  += grades[i];
            grade = sum / grades.length;
        }
        return grade;
    }
}