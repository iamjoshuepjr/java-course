package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.interfaces.Speaker;

// Abstract Class
// Superclass
// Subclass (implements)
public abstract class Person implements Speaker {
    // Is not required implementation for Speaker Interface's methods (because the class is an abstract class)
    // Attributes
    private String name;
    private byte age;
    private String gender;

    // Constructor
    public Person(String name, byte age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Abstract methods
    public abstract void wakeUp();
    public abstract void read(String[] books);
    public abstract void stayUpdated(String[] breakingNews);
    public abstract void relax();

    // getters
    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}