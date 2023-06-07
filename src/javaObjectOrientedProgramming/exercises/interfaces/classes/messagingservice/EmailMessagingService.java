package javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice;

import javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice.interfaces.MessagingService;
import javax.swing.JOptionPane;

public class EmailMessagingService implements MessagingService {
    @Override
    public void sendMessage(String recipient, String message) {
        JOptionPane.showMessageDialog(null, "Sending email to: " +recipient+ ": " + message);
    }

    @Override
    public void receiveMessage(String sender, String message) {
        JOptionPane.showMessageDialog(null, "Received email from " +sender+ ": " + message);
    }

    @Override
    public void deleteMessage(String messageId) {
        JOptionPane.showMessageDialog(null, "Deleted email with ID: " + messageId);
    }
}
