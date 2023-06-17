package javaObjectOrientedProgramming.exercises.interfaces.test;

import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.abstracts.Hacker;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.*;
import javaObjectOrientedProgramming.exercises.interfaces.classes.cyberAttack.enums.*;

public class CyberAttackTest {
    public static void main(String[] args) {

        Hacker whiteHat =  new WhiteHat("CipherGuard", Motivation.ACTIVISM, Techniques.MALWARE, Experience.SENIOR);
        Hacker grayHat = new GrayHat("RoguePhantom", Motivation.CURIOSITY, Techniques.SOCIAL_ENGINEERING, Experience.MID_LEVEL);
        Hacker blackHat = new BlackHat("ShadowStrike", Motivation.FINANCIAL_GAIN, Techniques.DDoS, Experience.JUNIOR);

        whiteHat.typeScript();
        whiteHat.executeAttack();

        grayHat.typeScript();
        grayHat.executeAttack();

        blackHat.typeScript();
        blackHat.executeAttack();

    }
}
