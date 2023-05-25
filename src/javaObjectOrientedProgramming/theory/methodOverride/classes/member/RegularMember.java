package javaObjectOrientedProgramming.theory.methodOverride.classes.member;

import javax.swing.JOptionPane;

// Subclass
// Object Class
public class RegularMember extends Member{
    // Attributes
    private String dateJoined;

    // Constructor
    public RegularMember(String name, byte age, String address, String contactNumber, String dateJoined){
        super(name, age, address, contactNumber);
        this.dateJoined = dateJoined;
    }

    // Getter and Setters
    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "Regular Member Information" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nDate joined: " + getDateJoined() +
                "\nAddress: " + getAddress() +
                "\nContact Number: " + getContactNumber()
        );
    }
}