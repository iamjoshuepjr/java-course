package javaFundamentals.fundamentals.stringClass;

import javax.swing.JOptionPane;

public class HandlingString {
    public static void main(String[] args) {
        var phrase = "I love Java Programming!";

        // Substring Methods
        var first = phrase.substring(0, 7); // I love
        var second = phrase.substring(7); // Java Programming!

        System.out.println("First Part of the Phrase: " +first); // I love
        System.out.println("Second Part of the Phrase: "+second); // Java Programming!

        String complement = "learn English Language";
        System.out.println("Complement: " + first + complement + " and " + second); // I love learn English Language and Java programming!

        boolean result = false;

        /**
         * Equals Method
         * .equals() -> Boolean Value
         */

        var word = JOptionPane.showInputDialog("Enter a word here: ");
        var word2 = JOptionPane.showInputDialog("Enter another word here: ");

        result = word.equals(word2);
        JOptionPane.showMessageDialog(null, "Are "+word+ " and " +word2+ " equals?: " +result);

        // .equalsIgnoreCase() -> Boolean Value
        var word3 = JOptionPane.showInputDialog("Enter a word here: ");
        var word4 = JOptionPane.showInputDialog("Enter another word here: ");

        result = word3.equalsIgnoreCase(word4);
        JOptionPane.showMessageDialog(null, "Are "+word3+ " and " +word4+ " equals?: " +result);
    }
}
