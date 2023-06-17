package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts.Hacker;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;

import javax.swing.JOptionPane;

public class BlackHat extends Hacker{

    public BlackHat(String alias, Motivation motivation, Techniques techniques, Experience levelExperience) {
        super(alias, motivation, techniques, levelExperience);
    }

    @Override
    public void typeScript() {
        JOptionPane.showMessageDialog(null, "Writing malicious scripts to exploit vulnerabilities.");
    }

    @Override
    public void executeAttack() {
        JOptionPane.showMessageDialog(null, "Executing a malicious cyber attack to compromise systems.");
    }
}