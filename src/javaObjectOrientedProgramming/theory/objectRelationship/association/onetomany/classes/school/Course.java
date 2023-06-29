package javaObjectOrientedProgramming.theory.objectRelationship.association.onetomany.classes.school;

public class Course {
    // Attributes
    private String id;
    private String name;

    // Empty Constructor
    public Course(){}

    // Overloaded Constructor
    public Course(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "id: " +id+ "\n" +
                "name: " + name;
    }
}