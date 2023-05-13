package javaSubroutines.procedures;
import javax.swing.JOptionPane;

public class Procedures {
    /**
     *  Procedures are subroutines that don't return a value.
     *  They are typically used to performing some action or task,
     *  such as printing output to the console or
     *  updating the state of an object.
     */

    public static void main(String[] args) {
        var name = JOptionPane.showInputDialog("What's your name?");
        greetUser(name);
        var quantity = Byte.parseByte(JOptionPane.showInputDialog("Character quantity"));
        var character = JOptionPane.showInputDialog("Enter the character you want to print").charAt(0);
        printCharacter(quantity, character);
    }
    public static void greetUser(String name){
        JOptionPane.showMessageDialog(null, "Hello, "+name+"!");
    }

    public static void printCharacter(byte quantity, char character){
        for (byte i  = 0;  i < quantity; i++) {
            System.out.print(character);
        }
    }
}