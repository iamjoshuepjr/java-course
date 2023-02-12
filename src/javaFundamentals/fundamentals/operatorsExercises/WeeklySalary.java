package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class WeeklySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter your hour worked: ");
        var hourWorked = input.nextFloat();
        System.out.print("Enter the hour price: ");
        var hourPrice = input.nextFloat();

        // process
        var weeklySalary = hourWorked * hourPrice;

        // output
        System.out.println("Your salary for this week is $: "+ weeklySalary);
    }
}
