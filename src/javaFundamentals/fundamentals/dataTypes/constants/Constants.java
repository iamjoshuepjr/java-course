package javaFundamentals.fundamentals.dataTypes.constants;

public class Constants {
    public static void main(String[] args) {
        // variables: Values that change throughout the program
        byte age = 5;  // first value
        System.out.println("\nFirst age value: " +age+ " years old");
        age = 24;      // second value
        System.out.println("Second age value: " +age+ " years old");

        // constants: Values that never change in the program.
        // A person's birthday does not change, age does change.

        final byte birthdate = 24;
        System.out.println("Birthdate: " +birthdate+ "th");
    }
}