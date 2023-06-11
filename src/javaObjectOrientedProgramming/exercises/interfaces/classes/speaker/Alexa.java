package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.VirtualAssistant;
import javax.swing.JOptionPane;

public class Alexa extends VirtualAssistant {

    public Alexa(String name, String language, float version, String location) {
        super(name, language, version, location);
    }

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
}
