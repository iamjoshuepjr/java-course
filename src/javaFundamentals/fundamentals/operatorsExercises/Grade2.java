package javaFundamentals.fundamentals.operatorsExercises;
import  java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("\n\tEnter your participation grade: ");
        var participation = input.nextFloat();
        System.out.print("\tEnter your first partial grade: ");
        var firstPartial = input.nextFloat();
        System.out.print("\tEnter your second partial grade: ");
        var secondPartial = input.nextFloat();
        System.out.print("\tEnter your third partial grade: ");
        var thirdPartial = input.nextFloat();

        // process
        participation *= 0.10f;
        firstPartial *= 0.25f;
        secondPartial *= 0.25f;
        thirdPartial *= 0.40f;

        // output
        var finalGrade = participation + firstPartial + secondPartial + thirdPartial;
        System.out.println("Your final grade is: " +finalGrade);
    }
}
