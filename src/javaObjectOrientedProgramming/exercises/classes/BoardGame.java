package javaObjectOrientedProgramming.exercises.classes;

import javax.swing.*;

/**
 * Build a program that allows controlling the movement of an object within a board
 * and updates its position within it.
 * The possible movements are:
 * -          Up
 * -     Left    Right
 * -         Down
 * After each movement, the program will display the new chosen direction and the object's coordinates on the board.
 */

// Object Class
public class BoardGame {
    // Attributes
    private int objectX;
    private int objectY;

    public BoardGame(int startX, int startY){
        objectX = startX;
        objectY = startY;
    }

     public void moveUp(){
        objectY--;
        displayPosition();
     }

    public void moveDown(){
        objectY++;
        displayPosition();
    }

    public void moveLeft(){
        objectX--;
        displayPosition();
    }

    public void moveRight(){
        objectX++;
        displayPosition();
    }

    private void displayPosition(){
        JOptionPane.showMessageDialog(null, "BoardGame" +
                "\nObject moved to (" +objectX+ ", " +objectY+ ")");
    }
}
