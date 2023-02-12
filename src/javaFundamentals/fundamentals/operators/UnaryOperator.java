package javaFundamentals.fundamentals.operators;

public class UnaryOperator {
    public static void main(String[] args) {
        // sign change operator (-)

        var number = 24;
        var inverseNumber = -number;
        System.out.println("Number: " + number);
        System.out.println("Inverse Number: " + inverseNumber+"\n");

        // negation operator (!)

        var logical = true;
        var inverseLogical = !logical;
        System.out.println("Logical: " + logical);
        System.out.println("Inverse Logical: " + inverseLogical);
        // -----------------------------------------------------------------------

        // increase Operator (++)
        // 1. (++)pre-increase: (symbol before var) first increase, then handle the variable
        System.out.println();
        var age = 24;
        System.out.println("Initial Age: " + age);
        var assignedAge = ++age;
        System.out.println("Age New Value: " + age);
        System.out.println("Assigned Age: " + assignedAge);
        System.out.println();

        // 2. post-increase(++): (symbol after var) first handle the variable, then increase
        var age2 = 19;
        System.out.println("Initial Age: " + age2);
        var assignedAge2 = age2++;
        System.out.println("Age New Value: " + age2);
        System.out.println("Assigned Age: " + assignedAge2);
        // -----------------------------------------------------------------------

        // Decrease Operator (--)
        // 1. (--)pre-decrement (symbol before var) first decrease, then handle the variable
        System.out.println();
        var ageHis = 24;
        System.out.println("Initial Age: " + ageHis);
        var assignedAgeHis = --ageHis;
        System.out.println("Age New Value: " + ageHis);
        System.out.println("Assigned Age: " + assignedAgeHis);

        // 2. post-decrement(--) (symbol after var) first handle the variable, then decrease
        System.out.println();
        var ageHer = 19;
        System.out.println("Initial Value: " + ageHer);
        var assignedAgeHer = ageHer--;
        System.out.println("Assigned Age: " + assignedAgeHer);
        System.out.println("Age New Value: " + ageHer);
    }
}
