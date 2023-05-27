package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;
import javax.swing.JOptionPane;

// Subclass
// Object Class
public class LinkedIn extends Microsoft {
    // Attributes
    private int userCount;

    // Constructor
    public LinkedIn(String name, short foundingYear, int userCount){
        super(name, foundingYear);
        this.userCount = userCount;
    }

    // Getters and Setters
    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null,  "MICROSOFT INFORMATION " +
                "\nDivision: " + getName() +
                "\nFounding Year: " + getFoundingYear() +
                "\nUser Count: " + getUserCount()
        );
    }
}
