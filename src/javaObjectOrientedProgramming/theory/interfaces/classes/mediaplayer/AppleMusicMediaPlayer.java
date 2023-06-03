package javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer;

import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.abstracts.VirtualMediaPlayer;
import javax.swing.JOptionPane;

// Concrete class implementing interface
public class AppleMusicMediaPlayer extends VirtualMediaPlayer {
    @Override
    public void play() {
        JOptionPane.showMessageDialog(null, "Apple' is playing a song!");
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