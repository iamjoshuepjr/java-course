package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.VirtualAssistant;
import javax.swing.JOptionPane;

public class Alexa extends VirtualAssistant {

    public Alexa(String name, String language, float version, String location) {
        super(name, language, version, location);
    }
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    // Inherited Methods
    @Override
    public void activate() {
        JOptionPane.showMessageDialog(null, "Alexa is now activated and ready to assist you.");
    }

    @Override
    public void deactivate() {
        JOptionPane.showMessageDialog(null, "Alexa is now deactivated. Goodbye!");
    }

    @Override
    public void sayHello() {
        JOptionPane.showMessageDialog(null, "Hello! I'm Alexa, your virtual assistant. How can I help you today?");
    }

    @Override
    public void speak() {
        JOptionPane.showMessageDialog(null, "I can provide you with information, play music, set timers, and much more.");
    }

    @Override
    public void sayThanks() {
        JOptionPane.showMessageDialog(null, "Thank you for using Alexa. Let me know if there's anything else I can assist you with.");
    }

    @Override
    public void sayBye() {
        JOptionPane.showMessageDialog(null, "Goodbye! Have a great day ahead!");
    }

    // Own Methods
    public void playMusic(String song) {
        showMessage("PLAYING MUSIC\n" +
                "Song: " + song +
                "\n\nGet ready to groove with Alexa! She's about to drop the hottest beats this side of the Internet!");
    }


    public void controlSmartHomeDevice(String device, String action) {
        showMessage("SMART HOME DEVICE CONTROL\n" +
                "Device: " + device +
                "\nAction: " + action +
                "\n\nAlexa is on the case! Watch in awe as she flawlessly controls the " + device + " with just a few magical words!");
    }
}
