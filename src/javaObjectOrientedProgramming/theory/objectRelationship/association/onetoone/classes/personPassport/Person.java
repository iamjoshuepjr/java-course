package javaObjectOrientedProgramming.theory.objectRelationship.association.onetoone.classes.personPassport;

import javax.swing.JOptionPane;

public class Person {
    private String name;
    private short age;
    private Passport passport;

    public Person(String name, short age){
        this.name = name;
        this.age = age;
    }

    public void setPassport(Passport passport){
        this.passport = passport;
    }

    public void travel(String destination){
        if (passport != null){
            JOptionPane.showMessageDialog(null, name + " is traveling to " + destination + " with passport number " + passport.getPassportNumber());
        } else {
            JOptionPane.showMessageDialog(null, name + " cannot travel without a passport.");
        }
    }
}
