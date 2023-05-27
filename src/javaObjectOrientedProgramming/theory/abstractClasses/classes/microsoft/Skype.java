package javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.microsoft.abstracts.Microsoft;

import javax.swing.*;

// Subclass
// Object Class
public class Skype extends Microsoft {
    // Attributes
    private boolean videoCallingEnabled;

    // Constructor
    public Skype(String name, short foundingYear, boolean videoCallingEnabled){
        super(name, foundingYear);
        this.videoCallingEnabled = videoCallingEnabled;
    }

    // Getters and Setters
    public boolean getVideoCallingEnabled() {
        return videoCallingEnabled;
    }

    public void setVideoCallingEnabled(boolean videoCallingEnabled) {
        this.videoCallingEnabled = videoCallingEnabled;
    }

    // Abstract methods
    @Override
    public void information() {
        JOptionPane.showMessageDialog(null,  "MICROSOFT INFORMATION " +
                "\nDivision: " + getName() +
                "\nFounding Year: " + getFoundingYear() +
                "\nVideo Calling Enabled: " + getVideoCallingEnabled()
        );
    }
}