package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums;

public enum Experience {
    JUNIOR ("Junior"),
    MID_LEVEL ("Mid Level"),
    SENIOR ("Senior");

    public String displayValue;
    private Experience(String displayValue){
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
