package javaFundamentals.fundamentals.operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        var age = 25;
        var ageMax = 24;
        var ageMin = 18;

        // And operator (&&) true and true = true, the rest is false
        var result = age >= ageMin && age <= ageMax;
        System.out.println("Result = "+result);

        // Or operator (||) false and false = false, the rest is true
        result = age >= ageMin || age <= ageMax;
        System.out.println("Result = " + result);
    }
}
