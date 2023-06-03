package javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer;

import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.interfaces.MediaPlayer;

import javax.swing.JOptionPane;

// Concrete class implementing interface
public class AppleMusicMediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        JOptionPane.showMessageDialog(null, "Apple's playing a song!");
    }

    @Override
    public void pause() {
        JOptionPane.showMessageDialog(null, "Apple has paused a song!");
    }

    @Override
    public void stop() {
        JOptionPane.showMessageDialog(null, "Apple has stopped a song!");
    }

    @Override
    public void next() {
        JOptionPane.showMessageDialog(null, "Apple's fast forward a song!");
    }

    @Override
    public void previous() {
        JOptionPane.showMessageDialog(null, "Apple's rewind a song!");
    }
}