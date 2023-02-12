package javaFundamentals.fundamentals.operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        // 1 Unary operators
        // 2 Parenthesis
        // 3 Arithmetics

        var x = 5;
        var y = 10;
        var z = ++x + y--;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Result: "+z);
    }
}
