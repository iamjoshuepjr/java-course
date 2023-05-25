package javaObjectOrientedProgramming.theory.polymorphism.methodOverride.classes.member;

import javax.swing.JOptionPane;

// Subclass
// Object Class
public class StaffMember extends Member{
    // Attributes
    private String role;
    private float baseSalary;

    // Constructor
    public StaffMember(String name, byte age, String address, String contactNumber, String role, float baseSalary){
        super(name, age, address, contactNumber);
        this.role = role;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getSalary(){
        float salary = baseSalary;
        if(role.equals("Manager")){
            salary += salary * 0.50f;
        } else if (role.equals("Supervisor")) {
            salary += salary * 0.65f;
        } else if (role.equals("Staff")) {
            salary += salary * 0.24f;
        }
        return salary;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "Staff Member Information" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nRole: " + getRole() +
                "\nAddress: " + getAddress() +
                "\nContact Number: " + getContactNumber()+
                "\nSalary: USD$ " + getSalary()
        );
    }
}