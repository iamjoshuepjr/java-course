package javaFundamentals.fundamentals.mathClass;

public class MathClass {
    public static void main(String[] args) {
        var  root = Math.sqrt(23);
        System.out.println("Root: "+ root);

        var base = 23; var exponent = 18;
        var pow = Math.pow(base, exponent);
        System.out.println("Pow: " +pow);

        var number = 23.58f;
        var round = Math.round(number);
        System.out.println("Round 1: "+round);

        var number2 = 23;
        var round2 = Math.round(number2);
        System.out.println("Round 2: "+round2);

        var random = Math.random();
        System.out.println(random * 100);
    }
}
