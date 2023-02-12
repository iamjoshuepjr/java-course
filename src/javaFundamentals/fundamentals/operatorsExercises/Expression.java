package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\tEnter 'a' value: ");
        var a = input.nextFloat();
        System.out.print("\tEnter 'b' value: ");
        var b = input.nextFloat();

        var expression = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        System.out.println("\n\tThe result: "+expression);
    }
}
