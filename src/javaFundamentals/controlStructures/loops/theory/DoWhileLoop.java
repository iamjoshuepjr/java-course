package javaFundamentals.controlStructures.loops.theory;
public class DoWhileLoop {
    public static void main(String[] args) {
        /* *
        *   The do while loop is similar to while loop. However, the body of do while loop is
        *   executed once before the test expression is checked.
        *   -------------------------------------------------------------------------------------
        *   1. The body od the loop is executed at first. Then the testExpression is evaluated
        *   2. If the testExpression evaluates to true, the body of the loop inside
        *      the do statement is executed again
        *   3. The testExpression is evaluated once again
        *   4. If the testExpression evaluates to true, the body of the loop inside
        *      the do statement is executed once again
        *   5. This process continues until the testExpression evaluates to false. Then te loop stops
        * */

        System.out.println("\n+-------------------------------------+");
        System.out.println("- Displaying the numbers from 1 to 24 -");
        System.out.println("+-------------------------------------+");

        var i = 1;
        do {
            //JOptionPane.showMessageDialog(null, "Number: "+i);
            System.out.println("Number: "+i);
            i++;
        }while (i < 25);
    }
}
