package javaObjectOrientedProgramming.exercises.test;

import javaObjectOrientedProgramming.exercises.classes.BoardGame;

public class BoardGameTest {
    public static void main(String[] args) {
        BoardGame game= new BoardGame(0, 0);
        game.moveUp();
        game.moveRight();
        game.moveDown();
        game.moveLeft();

    }
}
