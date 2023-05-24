package javaObjectOrientedProgramming.theory.methodOverride.classes.member;

import javax.swing.JOptionPane;

// Subclass
// Object Class
public class VolunteerMember extends Member {
    // Attributes
    private String[] areasOfService;

    // Constructor
    public VolunteerMember(String name, byte age, String address, String contactNumber, String[] areasOfService){
        super(name, age, address, contactNumber);
        this.areasOfService = areasOfService;
    }

    // Getter and Setters
    public String[] getAreasOfService(){
        return areasOfService;
    }

    public void setAreasOfService(String[] areasOfService) {
        this.areasOfService = areasOfService;
    }

    @Override
    public void information() {
        String areas = String.join(", ", getAreasOfService());
        JOptionPane.showMessageDialog(null, "Regular Member Information" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nAreas of Service: " + areas +
                "\nAddress: " + getAddress() +
                "\nContact Number: " + getContactNumber()
        );
    }
}
