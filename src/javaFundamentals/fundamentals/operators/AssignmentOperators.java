package javaFundamentals.fundamentals.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 24, b = 25;
        var c = a + 5 - b;
        System.out.println("int a = 24, b = 25;");
        System.out.println("var c = a + 5 - b: " +c);

        // composition increase
        a += 1; // a = a + 1;
        System.out.println("a += 1: " + a);
        a -= 2; // a = a - 2;
        System.out.println("a -= 2: " + a);
        a *= 7; // a = a * 7;
        System.out.println("a *= 7: " + a);
        a /= 3; // a = a / 3;
        System.out.println("a /= 3: " + a);
        a %= 2; // a = a % 5;
        System.out.println("a %= 2: " + a);
    }
}
