package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.interfaces.ICyberAttack;

public abstract class Hacker implements ICyberAttack {
    // Attributes
    private String alias;
    private Motivation motivation;
    private Techniques techniques;
    private Experience levelExperience;

    // Constructor
    public Hacker(String alias, Motivation motivation, Techniques techniques, Experience levelExperience) {
        this.alias = alias;
        this.motivation = motivation;
        this.techniques = techniques;
        this.levelExperience = levelExperience;
    }
}