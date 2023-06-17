package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts.Hacker;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;

import javax.swing.*;

public class GrayHat extends Hacker {

    public GrayHat(String alias, Motivation motivation, Techniques techniques, Experience levelExperience) {
        super(alias, motivation, techniques, levelExperience);
    }

    @Override
    public void typeScript() {
        JOptionPane.showMessageDialog(null, "Writing scripts to explore and expose vulnerabilities.");
    }

    @Override
    public void executeAttack() {
        JOptionPane.showMessageDialog(null, "Executing cyber attacks to raise awareness of security flaws.");
    }
}
