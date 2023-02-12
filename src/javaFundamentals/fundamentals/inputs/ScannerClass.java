package javaFundamentals.fundamentals.inputs;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner Class to save inputs from screen
        Scanner input = new Scanner(System.in);

        // -----------------  Input Strings -----------------
        // Method 1
        System.out.println();
        System.out.print("Enter your full name: ");
        var fullName = input.nextLine();
        System.out.println("Full Name: " +fullName);
        System.out.println("Method Used: nextLine(). Saves all characters of a strings ");

        // Method 2
        System.out.println();
        System.out.print("Enter your nickname: ");
        var nickname = input.next();
        System.out.println("Nickname: " +nickname);
        System.out.println("Method Used: next(). Only saves strings until find a space. ");

        // -----------------   Input Characters -----------------
        System.out.println();
        System.out.print("Enter a character: ");
        var character = input.next().charAt(0);
        System.out.println("Character: " +character);

        //  -----------------  Input Integers  -----------------
        // byte integer
        System.out.println();
        System.out.print("How old are you?: ");
        var age = input.nextByte();
        System.out.println("Age: " +age);

        // short integer
        System.out.println();
        System.out.print("What's your birth year?: ");
        var birthYear = input.nextShort();
        System.out.println("Birth year: " +birthYear+"\n");

        // int
        System.out.print("What's your ID?: ");
        var id = input.nextInt();
        System.out.println("ID: "+id+"\n");

        //  -----------------  Input Floats  -----------------
        // float
        System.out.print("What's your salary?: ");
        var salary = input.nextFloat();
        System.out.println("Salary $: "+salary+"\n");

        // double
        System.out.print("Type a big decimal number: ");
        var bigNumber = input.nextDouble();
        System.out.println("Number: "+bigNumber+"\n");
    }
}
