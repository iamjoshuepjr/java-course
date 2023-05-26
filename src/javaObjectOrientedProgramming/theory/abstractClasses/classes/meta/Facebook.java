package javaObjectOrientedProgramming.theory.abstractClasses.classes.meta;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.SocialMediaPlatform;

import javax.swing.JOptionPane;

public class Facebook extends SocialMediaPlatform {

    public Facebook(String platformName, long totalUsers){
        super(platformName, totalUsers);
    }

    @Override
    public void information() {
        JOptionPane.showMessageDialog(null, "FACEBOOK INFORMATION" +
                "");
    }
}
