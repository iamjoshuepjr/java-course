package javaFundamentals.controlStructures.loops.exercises;

import javax.swing.JOptionPane;

public class GuessRandomNumber {
    public static void main(String[] args) {
        /*
        * Make a game to guess a number.
        * To do this, generate a random number between 0 -  100, then indicate "is greater" or "is less"
        * with respect to N. The process ends when the user hits. Show the number of attempts.
        * */
        var random = (int) Math.random() * 100;
        var counter = 0;
        byte number;

        do {
            number = Byte.parseByte(JOptionPane.showInputDialog("Enter a number here: "));
            if(random > number){
                JOptionPane.showMessageDialog(null, "Enter a greater number.");
            }else {
                JOptionPane.showMessageDialog(null, "Enter a less number.");
            }
            counter++;
        }
        while (number != random);
        JOptionPane.showMessageDialog(null, "Attempts: "+counter);
    }
}
