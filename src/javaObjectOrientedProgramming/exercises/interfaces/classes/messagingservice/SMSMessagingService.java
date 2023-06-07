package javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice;

import javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice.interfaces.MessagingService;
import javax.swing.JOptionPane;

public class SMSMessagingService implements MessagingService {
    @Override
    public void sendMessage(String recipient, String message) {
        JOptionPane.showMessageDialog(null, "Sending SMS to: " +recipient+ ": " + message);
    }

    @Override
    public void receiveMessage(String recipient, String message) {
        JOptionPane.showMessageDialog(null, "Received SMS from " +recipient+ ": " + message);
    }

    @Override
    public void deleteMessage(String messageId) {
        JOptionPane.showMessageDialog(null, "Deleted SMS message with ID: " + messageId);
    }
}