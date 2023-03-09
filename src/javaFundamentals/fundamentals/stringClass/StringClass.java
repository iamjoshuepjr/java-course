package javaFundamentals.fundamentals.stringClass;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);
        // input
        System.out.print("Enter your name: ");
        var name = input.nextLine();

        // process - output
        System.out.println("Your name has " + name.length() +" letters.");
        System.out.println("The first letter is: " +name.charAt(0));
        var lastLetter = name.length();
        System.out.println("The last letter is: " +name.charAt(lastLetter-1));
    }
}