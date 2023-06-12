package javaObjectOrientedProgramming.exercises.interfaces.classes.speaker;

import javaObjectOrientedProgramming.exercises.interfaces.classes.speaker.abstracts.VirtualAssistant;
import javax.swing.JOptionPane;

public class Siri extends VirtualAssistant {
    public Siri(String name, String language, float version, String location) {
        super(name, language, version, location);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Inherited Methods
    @Override
    public void activate() {
        showMessage("Siri is now activated and ready to assist you!");
    }

    @Override
    public void deactivate() {
        showMessage("Siri is now deactivated. Goodbye!");
    }

    @Override
    public void sayHello() {
        showMessage("Hi there! I'm Siri, your personal assistant. How can I help you today?");
    }

    @Override
    public void speak() {
        showMessage("I can assist you with various tasks, including\n* Answering questions \n* Providing information \n* Setting reminders \n* Playing music  \n* And more.");
    }

    @Override
    public void sayThanks() {
        showMessage("Thanks for using Siri. Let me know if there's anything else I can do for you.");
    }

    @Override
    public void sayBye() {
        showMessage("Goodbye! Have a wonderful day!");
    }

    // Own Methods
    public void sendTextMessage(String recipient, String message){
        showMessage("SEND MESSAGE\n " +
                "\nRecipient: " + recipient +
                "\nMessage: " + message);
    }

    public void makePhoneCall(String phoneNumber) {
        String funnyMessage = "";

        // Generate a random funny message for making a phone call
        if (phoneNumber.matches("\\d{10}")) {
            funnyMessage = "Dialing " + phoneNumber + "... Connecting you to the secret agent squirrel network!";
        } else if (phoneNumber.startsWith("555")) {
            funnyMessage = "Calling " + phoneNumber + "... Please hold while we connect you to the fictional character hotline!";
        } else {
            funnyMessage = "Dialing " + phoneNumber + "... Hope you're ready to talk to the ghosts of ancient rotary phones!";
        }

        showMessage("MAKE A PHONE CALL\n" + "Phone number: " + phoneNumber + "\n\n" + funnyMessage);
    }


    public void getWeatherForecast(String location) {
        String funnyMessage = "";

        // Check if the location is a valid state within the United States
        if (isState(location)) {
            funnyMessage = "The weather in " + location + " will be as unpredictable as a squirrel in a tornado! Keep an umbrella handy, just in case!";
        } else {
            funnyMessage = "I'm sorry, the weather forecast for " + location + " is currently unavailable. Maybe it's time to consult a weather-dancing unicorn!";
        }

        showMessage(funnyMessage);
    }

    private boolean isState(String location) {
        String[] states = {
                "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida",
                "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
                "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska",
                "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio",
                "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
                "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
        };

        for (String state : states) {
            if (state.equalsIgnoreCase(location)) {
                return true;
            }
        }
        return false;
    }
}