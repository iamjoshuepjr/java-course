package javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums;

public enum Techniques {
    SOCIAL_ENGINEERING ("Social Engineering"),
    MALWARE ("Malware"),
    DDoS ("DDoS");

    public String displayValue;

    private Techniques(String displayValue){
        this.displayValue = displayValue;
    }
}
