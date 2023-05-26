package javaObjectOrientedProgramming.theory.abstractClasses.test;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.Facebook;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.Instagram;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.WhatsApp;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.Meta;

// Controller Class
public class MetaTest {

    public static void display(Meta platform){
        platform.information(platform);
    }
    public static void main(String[] args) {
        // Polymorphism between classes
        Meta facebook = new Facebook("Facebook", 2989000000L);
        Meta whatsApp = new WhatsApp("WhatsApp", 2400000000L);
        Meta instagram = new Instagram("Instagram", 1628000000L);

        display(facebook);
        display(whatsApp);
        display(instagram);
    }
}