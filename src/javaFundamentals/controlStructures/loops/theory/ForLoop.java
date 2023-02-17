package javaFundamentals.controlStructures.loops.theory;

public class ForLoop {
    public static void main(String[] args) {
        /*
        * Java for loop is used to run a block of code for a certain number of items.
        * Syntax:
        * for (initialExpression; testExpression; updateExpression){
        *     body of the loop
        * }
        * 1. The initialExpression initializes and/or declares variables and executes only once
        * 2. The conditionExpression (condition) is evaluated. If the condition is true,
        *    the body of the for loop is executed
        * 3. The updateExpression updates the value of initialExpression
        * 4- The condition is evaluates again. The process continues until the condition is false
        * */

        System.out.println("\n+-------------------------------------+");
        System.out.println("- Displaying the numbers from 1 to 24 -");
        System.out.println("+-------------------------------------+\n");

        for (byte i = 1; i < 25; i++){
            System.out.println("Number: "+i);
        }
    }
}
