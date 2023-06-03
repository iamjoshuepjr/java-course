package javaObjectOrientedProgramming.theory.interfaces.test;

import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.AppleMusicMediaPlayer;
import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.SpotifyMediaPlayer;
import javaObjectOrientedProgramming.theory.interfaces.classes.mediaplayer.interfaces.MediaPlayer;

// Controller Class
public class MediaPlayerTest {
    public static void main(String[] args) {

        MediaPlayer appleMP = new AppleMusicMediaPlayer();
        MediaPlayer spotifyMP = new SpotifyMediaPlayer();

        appleMP.play();
        appleMP.next();
        appleMP.stop();

        spotifyMP.play();
        spotifyMP.next();
        spotifyMP.stop();

    }
}