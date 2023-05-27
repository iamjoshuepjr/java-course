package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class GitHub extends Microsoft {
    // Attributes
    private String repository;

    // Constructor
    public GitHub(String name, short foundingYear, String repository) {
        super(name, foundingYear);
        this.repository = repository;
    }

    // Getters and Setters
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null,  "MICROSOFT INFORMATION " +
                "\nDivision: " + getName() +
                "\nFounding Year: " + getFoundingYear() +
                "\nRepository: " + getRepository()
        );
    }
}