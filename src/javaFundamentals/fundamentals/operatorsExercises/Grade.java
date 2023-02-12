package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("\nEnter your first grade: ");
        var grade1 = input.nextFloat();
        System.out.print("\nEnter your second grade: ");
        var grade2 = input.nextFloat();
        System.out.print("\nEnter your third grade: ");
        var grade3 = input.nextFloat();

        // process
        var result = (grade1 + grade2 + grade3)/3;

        // result
        System.out.println("\nYour final grade is: "+result);
    }
}
