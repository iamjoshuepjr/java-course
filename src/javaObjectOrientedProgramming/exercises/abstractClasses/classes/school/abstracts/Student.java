package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts;

public abstract class Student extends Person{
    // Attributes
    private int studentId;
    private String gradeLevel;
    private float GPA;

    // Constructor
    public Student(int personId, String name, String phoneNumber, String email, int studentId, String gradeLevel, float GPA) {
        super(personId, name, phoneNumber, email);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public float getGPA() {
        return GPA;
    }

    public abstract void study();
    public abstract void submitAssignment();

}