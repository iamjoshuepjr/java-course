package javaObjectOrientedProgramming.theory.informationHiding.test;
import javaObjectOrientedProgramming.theory.informationHiding.person.Person;

import javax.swing.JOptionPane;

// Controller Class
public class PersonTest {
    public static void main(String[] args) {

        // Instantiating a Person Object in test package
        Person person = new Person(1128229210, "Joshuép Jr.", "24/01/1999");

        JOptionPane.showMessageDialog(null, "Personal Information" +
                "\nID: "+person.getId() +
                "\nName: " + person.getName() +
                "\nBirthday: " + person.getBirthday());

        // Accessing attributes via getters and setters
        person.setName("Dayanna");
        person.setBirthday("4/05/2008");

        JOptionPane.showMessageDialog(null, "Personal Information" +
                "\nID: "+person.getId() +
                "\nName: " + person.getName() +
                "\nBirthday: " + person.getBirthday());
    }
}