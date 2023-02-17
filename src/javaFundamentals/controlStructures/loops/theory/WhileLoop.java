package javaFundamentals.controlStructures.loops.theory;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        *  Java while loop is used to run a specific code until
        *  a certain condition is met.
        *  1. A while loop evaluates the expression inside the parentheses (),
        *  2. if the expression evaluates to true, the code inside the while loop is executed
        *  3. The expression is evaluated again
        *  4. This process continues until expression is false
        *  5. When the expression evaluates to false, the loop stops
        */

        var count = 1;

        System.out.println("\n+-------------------------------------+");
        System.out.println("- Displaying the numbers from 1 to 24 -");
        System.out.println("+-------------------------------------+");
        
        while (count < 25){
            System.out.println("Number: "+count);
            count++;
        }
    }
}
