package javaFundamentals.fundamentals.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator (?)
        var num1 = 2;
        var num2 = 4;
        var result = (num1 < num2) ? num2 + " is greater": num1 + " is smaller";
        System.out.println("Result = " +result);

        var odd = 9;
        result = (odd %2 == 0) ? "Even number": "Odd number";
        System.out.println("Result: "+result);
    }
}
