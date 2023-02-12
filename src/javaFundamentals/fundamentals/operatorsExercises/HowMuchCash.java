package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class HowMuchCash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("\n\tWelcome, enter your mount of money $");
        var guillermo = input.nextFloat();

        // process
        var luis = guillermo/2;
        var juan = (guillermo + luis)/2;

        var total = guillermo + luis + juan;

        // output
        System.out.println("\n\tGuillermo has: $"+guillermo+" dollars.");
        System.out.println("\tLuis has: $"+luis+" dollars.");
        System.out.println("\tJuan has: $"+juan+" dollars.");
        System.out.println("\n\tThe mount of money is: $"+total);
    }
}
