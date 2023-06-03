package javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer;

import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.interfaces.MediaPlayer;

import javax.swing.JOptionPane;

// Concrete class implementing interface
public class SpotifyMediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        JOptionPane.showMessageDialog(null, "Spotify is playing a song!");
    }

    @Override
    public void pause() {
        JOptionPane.showMessageDialog(null, "Spotify has paused a song!");
    }

    @Override
    public void stop() {
        JOptionPane.showMessageDialog(null, "Spotify has stopped a song!");
    }

    @Override
    public void next() {
        JOptionPane.showMessageDialog(null, "Spotify's fast forward a song!");
    }

    @Override
    public void previous() {
        JOptionPane.showMessageDialog(null, "Spotify's rewind a song!");
    }
}