package javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.school;

import java.util.List;

public class Student {
    // Attributes
    private String id;
    private String name;

    private List<Course> courses;

    // Empty Constructor
    public Student(){}

    // Overloaded Constructor
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return  "Id: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Courses: " + getCourses();
    }
}