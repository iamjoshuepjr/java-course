package javaObjectOrientedProgramming.exercises.abstractClasses.classes.school.abstracts;

public abstract class Person {
    // Attributes
    private int personId;
    private String name;
    private String phoneNumber;
    private String email;

    // Constructor
    public Person(int personId, String name, String phoneNumber, String email){
        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Abstract Methods
    public abstract void displayInformation();
}