package javaFundamentals.arrays.oneDimensional.exercises;

import javax.swing.JOptionPane;

public class Palindromes {
    public static void main(String[] args) {
        var text = JOptionPane.showInputDialog("Enter a word here: ");
        var length = text.length();

        char[] letter = new char[length];
        char[] opposite = new char[length];

        var inverse = length;

        var equal = true;
        for (int i = 0; i < length; i++) {
            opposite[i] = text.toLowerCase().charAt(inverse - 1);
            inverse--;
            letter[i] = text.toLowerCase().charAt(i);

            if (opposite[i] != letter[i]){
                equal = false;
                break;
            }
        }

        if (equal == false){
            System.out.println("The entered word "  +text+ " is not a Palindrome!");
        }
        else {
            System.out.println("Congrats!\nThe entered " +text+ " word is a Palindrome!");
        }
    }
}
