package javaObjectOrientedProgramming.exercises.interfaces.test;

import javaObjectOrientedProgramming.exercises.interfaces.classes.messagingservice.*;

// Controller Class
public class MessageServiceTest {
    public static void main(String[] args) {
        SMSMessagingService smsService = new SMSMessagingService();
        smsService.sendMessage("1234567890", "Hello from SMS!");
        smsService.receiveMessage("1234567890", "Hello from SMS!");
        smsService.deleteMessage("1234567890");


        EmailMessagingService emailService = new EmailMessagingService();
        emailService.sendMessage("example@example.com", "Hello from email!");
        emailService.receiveMessage("example@example.com", "Hello from email!");
        emailService.deleteMessage("example@example.com");
    }
}