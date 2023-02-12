package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("\n\tEnter 'a' value: ");
        var a = input.nextFloat();
        System.out.print("\tEnter 'b' value: ");
        var b = input.nextFloat();
        System.out.print("\tEnter 'c' value: ");
        var c = input.nextFloat();

        // process

        var power = (float)Math.pow(b, 2);
        var root = (float) Math.sqrt(power - (4*a*c));

        var positiveExpression = -b + root / 2*a;
        var negativeExpression = -b - root / 2*a;

        // output
        System.out.println("\tPositive Expression: " + positiveExpression);
        System.out.println("\tNegative Expression: " + negativeExpression);
    }
}
