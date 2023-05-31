package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts;

public abstract class Staff extends Person{
    // Attributes
    private int staffId;

    // Constructor
    public Staff(int personId, int staffId, String name, String phoneNumber, String email) {
        super(personId, name, phoneNumber, email);
        this.staffId = staffId;
    }

    // Abstract Method
    public abstract void work();
}