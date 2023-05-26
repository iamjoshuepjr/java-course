package javaObjectOrientedProgramming.theory.abstractClasses.classes.meta;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.SocialMediaPlatform;

public class WhatsApp extends SocialMediaPlatform {

    public WhatsApp(String platformName, long totalUsers){
        super(platformName, totalUsers);
    }

    @Override
    public void information() {
    }
}
