package javaObjectOrientedProgramming.theory.methodOverride.classes.member;

import javax.swing.JOptionPane;

/**
 * In Java, method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
 * Method overriding is a fundamental concept in object-oriented programming and is used to achieve runtime polymorphism.
 * When a subclass inherits a method from its superclass, it can choose to override that method by providing its own implementation.
 * The overridden method in the subclass should have the same method signature (name, return type, and parameter list) as the method in the superclass.
 * The `@Override` annotation is optional but recommended to ensure that the method is correctly overridden.
 * Method overriding allows you to provide specialized behavior in subclasses while still using the common interface defined in the superclass.
 * This feature is crucial for achieving code re-usability, extensibility, and implementing specific behaviors for different types of objects in an inheritance hierarchy.
 */

// Superclass
// Object Class
public class Member {
    // Attributes
    private String name;
    private byte age;
    private String address;
    private String contactNumber;

    // Constructor
    public Member(String name, byte age, String address, String contactNumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Methods
    public void information(){
        JOptionPane.showMessageDialog(null, "Member Information" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress() +
                "\nContact Number: " + getContactNumber()
        );
    }
}