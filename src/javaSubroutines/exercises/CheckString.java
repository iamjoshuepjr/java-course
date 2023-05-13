package javaSubroutines.exercises;
import javax.swing.JOptionPane;

public class CheckString {
    public static void main(String[] args) {
        var text = "";
        do {
            text = JOptionPane.showInputDialog("Enter an integer here: ");
        } while (!isInteger(text));

        var integer = Integer.parseInt(text);
        System.out.println("Integer Value: " + integer);
    }

    public static boolean isInteger(String text) {
        if(text.length() == 0){
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i) < '0') || (text.charAt(i) > '9')){
                return false;
            }
        }
        return true;
    }
}
