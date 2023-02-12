package javaFundamentals.fundamentals.operatorsExercises;
import java.util.Scanner;

public class MonthlySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var baseSalary = 1000f;


        // input
        System.out.print("\tAmount of cars sold: ");
        var carSold = input.nextInt();
        System.out.print("\tAmount of money got: ");
        var money = input.nextInt();


        // process
        var commission = carSold * 150f;
        var fivePercent = money * 0.05f;
        var total = baseSalary + commission + fivePercent;
        System.out.println();
        System.out.println("\n\tCommission: $" + commission);
        System.out.println("\t5%: $" + fivePercent);
        System.out.println("\t\tTotal: "+ total);

        // output
        //var netSalary = (carSold);
    }
}
