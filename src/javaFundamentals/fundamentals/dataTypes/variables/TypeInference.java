package javaFundamentals.fundamentals.dataTypes.variables;
import java.util.Scanner;

public class TypeInference {
    public static void main(String[] args) {
        // Int
        var integer = 24;
        System.out.println("Integer number using type inference: " + integer);

        // double
        var decimal_double = 24.4;
        System.out.println("Double number using type inference: " + decimal_double);

        var decimal_float = 24.9;
        System.out.println("Float number using type inference: " + decimal_float);

        // We can use var to create objects
        var input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        var age = Integer.parseInt(input.nextLine());
        System.out.println("Age: " +age);;
        System.out.println("+------------------------+");

        // Save a char
        var character = "Hello".charAt(3);
        System.out.println("Character: " +character);
    }
}
