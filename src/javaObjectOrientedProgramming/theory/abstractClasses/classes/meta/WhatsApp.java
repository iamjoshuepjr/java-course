package javaObjectOrientedProgramming.theory.abstractClasses.classes.meta;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.Meta;

public class WhatsApp extends Meta {

    public WhatsApp(String platformName, long totalUsers){
        super(platformName, totalUsers);
    }

    @Override
    public void information() {
    }
}
