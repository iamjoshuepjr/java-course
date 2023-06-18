package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.interfaces.ICyberAttack;
import javax.swing.JOptionPane;

public abstract class Hacker implements ICyberAttack {
    // Attributes
    private static int lastAssignedId = 0;
    private int id;
    private String alias;
    private Motivation motivation;
    private Techniques techniques;
    private Experience levelExperience;

    // Constructor
    public Hacker(String alias, Motivation motivation, Techniques techniques, Experience levelExperience) {
        this.id = ++lastAssignedId;
        this.alias = alias;
        this.motivation = motivation;
        this.techniques = techniques;
        this.levelExperience = levelExperience;
    }

    // private methods
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void information(){
        showMessage("HACKER INFORMATION\n" +
                "Id: " + id +
                "\nAlias: " + alias +
                "\nMotivation: " + motivation +
                "\nTechniques: " + techniques +
                "\nLevel Experience: " + levelExperience);
    }

}