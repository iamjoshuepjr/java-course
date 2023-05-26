package javaObjectOrientedProgramming.theory.abstractClasses.test;

import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.Facebook;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.Instagram;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.WhatsApp;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.Meta;

import javax.swing.JOptionPane;

// Controller Class
public class SocialMediaPlatformTest {

    public static void display(Meta platform){
        JOptionPane.showMessageDialog(null, "SOCIAL MEDIA INFORMATION" +
          "\nPlatform Name: " + platform.getPlatformName() +
          "\nTotal Users: " + platform.getTotalUsers()
        );
    }
    public static void main(String[] args) {
        // Polymorphism between classes
        Meta facebook = new Facebook("Facebook", 2500000000L);
        Meta twitter = new WhatsApp("Twitter", 330000000L);
        Meta instagram = new Instagram("Instagram", 1000000000L);

        display(facebook);
        display(twitter);
        display(instagram);
    }
}
