package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums;

public enum Motivation {
    FINANCIAL_GAIN ("Financial Gain"),
    ACTIVISM ("Activism"),
    CURIOSITY ("Curiosity");

    public String displayValue;
    private Motivation(String displayValue){
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
