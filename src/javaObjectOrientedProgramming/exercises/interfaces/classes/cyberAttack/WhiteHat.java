package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts.Hacker;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;

import javax.swing.*;

public class WhiteHat extends Hacker {

    public WhiteHat(String alias, Motivation motivation, Techniques techniques, Experience levelExperience) {
        super(alias, motivation, techniques, levelExperience);
    }

    @Override
    public void typeScript() {
        JOptionPane.showMessageDialog(null, "Writing secure and defensive scripts to protect systems.");
    }

    @Override
    public void executeAttack() {
        JOptionPane.showMessageDialog(null, "Executing a defensive cyber attack to identify vulnerabilities.");
    }
}