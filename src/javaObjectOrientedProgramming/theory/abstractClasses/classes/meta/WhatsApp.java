package javaObjectOrientedProgramming.theory.abstractClasses.classes.meta;
import javaObjectOrientedProgramming.theory.abstractClasses.classes.meta.abstracts.Meta;

import javax.swing.JOptionPane;

public class WhatsApp extends Meta {

    public WhatsApp(String platformName, long totalUsers){
        super(platformName, totalUsers);
    }

    @Override
    public void information(Meta platform) {
        String platformName = platform.getPlatformName();
        JOptionPane.showMessageDialog(null,  platformName.toUpperCase() + " INFORMATION " +
                "\nPlatform Name: " + platformName +
                "\nTotal Users: " + platform.getTotalUsers());
    }
}
