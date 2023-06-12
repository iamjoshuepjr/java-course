package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.VirtualAssistant;
import javax.swing.JOptionPane;
import java.util.Date;

public class GoogleAssistant extends VirtualAssistant {
    public GoogleAssistant(String name, String language, float version, String location) {
        super(name, language, version, location);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    //  Inherited Methods
    public void activate() {
        showMessage("Google Assistant is now activated and ready to assist you.");
    }

    @Override
    public void deactivate() {
        showMessage("Google Assistant is now deactivated. Goodbye!");
    }

    @Override
    public void sayHello() {
        showMessage("Hello! I'm Google Assistant, your virtual assistant. How can I help you today?");
    }

    @Override
    public void speak() {
        showMessage("I can help you with a wide range of tasks, such as answering questions, providing information, setting reminders, playing music, and much more.");
    }

    @Override
    public void sayThanks() {
        showMessage("Thank you for using Google Assistant. Let me know if there's anything else I can assist you with.");
    }

    @Override
    public void sayBye() {
        showMessage("Goodbye! Have a great day ahead!");
    }

    // Own Methods
    public void playPodcast(String[] podcasts){
        StringBuilder message = new StringBuilder();
        message.append("Podcasts to play: \n");
        for (String podcast: podcasts) {
            message.append(podcast);
            if(podcast != podcasts[podcasts.length - 1]){
                message.append(", ");
            } else {
                message.append(". ");
            }
        }
        JOptionPane.showMessageDialog(null, "PLAYING PODCASTS: " + message.toString());
    }

    public void scheduleMeeting(String[] participants, String location, Date time){
        StringBuilder message = new StringBuilder();
        message.append("\nParticipants: ");
        for ( String assistant: participants ) {
            message.append(assistant);
            if (assistant != participants[participants.length - 1]) {
                message.append(", ");
            } else {
                message.append(". ");
            }
        }
        message.append("\nLocation: " + location);
        message.append("\nDate: " + time);
        JOptionPane.showMessageDialog(null, "SCHEDULING MEETING: " + message.toString());
    }
}