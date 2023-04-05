package javaSubroutines.exercises;

import javax.swing.JOptionPane;

public class CheckString {
    public static void main(String[] args) {
        var text = "";
        do {
            text = JOptionPane.showInputDialog("Enter a text here: ");
        } while (!isInteger(text));

        var integer = Integer.parseInt(text);
        System.out.println("Integer Value: " + integer);
    }

    public static boolean isInteger(String array) {
        if(array.length() == 0){
            return false;
        }

        for (int i = 0; i < array.length(); i++) {
            if((array.charAt(i) < '0') || (array.charAt(i) > '9')){
                return false;
            }
        }
        return true;
    }
}
