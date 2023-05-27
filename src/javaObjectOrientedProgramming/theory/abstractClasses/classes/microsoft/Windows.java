package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class Windows extends Microsoft {
    // Attributes
    private String version;

    // Constructor
    public Windows(String name, short foundingYear, String version){
        super(name, foundingYear);
        this.version = version;
    }

    // Getter and Setters
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null,  "MICROSOFT INFORMATION " +
                "\nDivision: " + getName() +
                "\nFounding Year: " + getFoundingYear() +
                "\nVersion: " + getVersion()
        );
    }
}