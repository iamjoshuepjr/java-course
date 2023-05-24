package javaObjectOrientedProgramming.exercises.inheritance.classes.publication;

import javax.swing.*;

public class CD extends Publication {
    // Attributes
    private float playbackTime;

    // Constructor
    public CD(String title, float price, float playbackTime){
        super(title, price);
        this.playbackTime = playbackTime;
    }

    // Getter and Setters
    public float getPlaybackTime() {
        return playbackTime;
    }

    public void setPlaybackTime(float playbackTime) {
        this.playbackTime = playbackTime;
    }

    public void play(){
        JOptionPane.showMessageDialog(null, "CD Information" +
                "\nPlaying " + getTitle() +
                "\nPlayback time " +getPlaybackTime());
    }
}
