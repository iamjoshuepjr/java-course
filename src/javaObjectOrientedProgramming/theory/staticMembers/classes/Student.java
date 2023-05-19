package javaObjectOrientedProgramming.theory.staticMembers.classes;

public class Student {

    // Class Attributes
    private static int nextStudentId = 1000;
    private static String universityName = "XYZ University";

    // Instance Attributes
    private int studentId;
    private String name;

    // Constructor
    public Student(String name){
        this.name = name;
        studentId = nextStudentId++;
    }

    // Setters and getters
    public static String getUniversityName(){
        return universityName;
    }

    public static void setUniversityName(String name){
        universityName = name;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName() {
        return name;
    }
}
