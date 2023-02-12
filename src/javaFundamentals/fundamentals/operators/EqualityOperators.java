package javaFundamentals.fundamentals.operators;

public class EqualityOperators {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        // Equality Operator
        var c = (a == b);
        System.out.println("Is A equal to B?: " + c);
        var d = a != b;
        System.out.println("Is A different to B?: "+d);

        //Equality with Strings

        var myFeelings = "Love";
        var herFeelings = "Love";
        var equal = myFeelings == herFeelings; // memory reference compare (content)
        System.out.println("Are my feelings equal to her?: " +equal);

        var isEquals = myFeelings.equals(herFeelings); // content compare
        System.out.println("My feelings vs her feelings: " + isEquals);
    }
}
