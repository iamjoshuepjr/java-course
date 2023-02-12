package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class WeeksDaysHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter the total hours: ");
        var totalHours = input.nextInt();

        // process
        var weeks = totalHours / 168;
        var days = totalHours % 168 / 24;
        var hours = totalHours % 24;

        // output
        System.out.println("\t\nTotal hours: "+totalHours);
        System.out.println("\t* Weeks: "+weeks);
        System.out.println("\t* Days:  "+days);
        System.out.println("\t* Hours: "+hours);
    }
}
