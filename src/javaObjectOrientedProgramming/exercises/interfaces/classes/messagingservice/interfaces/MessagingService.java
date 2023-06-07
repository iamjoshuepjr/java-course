package javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice.interfaces;

public interface MessagingService {
    void sendMessage(String recipient, String message);
    void receiveMessage(String sender, String message);
    void deleteMessage(String messageId);
}
