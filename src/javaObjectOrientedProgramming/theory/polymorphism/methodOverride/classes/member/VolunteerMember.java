package javaObjectOrientedProgramming.theory.polymorphism.methodOverride.classes.member;

import javax.swing.JOptionPane;

// Subclass
// Object Class
public class VolunteerMember extends Member {
    // Attributes
    private String[] areasOfService;
    private int volunteerHours;

    // Constructor
    public VolunteerMember(String name, byte age, String address, String contactNumber, String[] areasOfService, int volunteerHours){
        super(name, age, address, contactNumber);
        this.areasOfService = areasOfService;
        this.volunteerHours = volunteerHours;
    }

    // Getter and Setters
    public String[] getAreasOfService(){
        return areasOfService;
    }

    public void setAreasOfService(String[] areasOfService) {
        this.areasOfService = areasOfService;
    }

    public int getVolunteerHours() {
        return volunteerHours;
    }

    public void setVolunteerHours(int volunteerHours) {
        this.volunteerHours = volunteerHours;
    }

    @Override
    public void information() {
        String areas = String.join(", ", getAreasOfService());
        JOptionPane.showMessageDialog(null, "Volunteer Member Information" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nAreas of Service: " + areas +
                "\nVolunteer Hours: " + getVolunteerHours() +
                "\nAddress: " + getAddress() +
                "\nContact Number: " + getContactNumber()
        );
    }
}