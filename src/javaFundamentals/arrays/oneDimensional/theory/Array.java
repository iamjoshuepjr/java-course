package javaFundamentals.arrays.oneDimensional.theory;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        /*
        * ===========================================================
        *                       ARRAYS
        * ===========================================================
        * An array is a collection of similar types of data
        * The number of the values in an array is always fixed
        *
        * ===========================================================
        *          HOW TO DECLARE AN ARRAY IN JAVA?
        * ==========================================================
        *                        Syntax
        * dataType[] arrayName;
        * dataType - it can be primitive data types or java objects
        * arrayName - it is an identifier
        */
         String[] names;
        /*
        * ===========================================================
        *          HOW MANY ELEMENTS CAN ARRAY THIS HOLD?
        * ==========================================================
        * To define the number of elements that an array can hold,
        * we have to allocate memory for the array.
        * ==========================================================
        *                        Syntax
        * arrayName = new dataType[numberElements];
        */
        names = new String[6];

        /*
        *  Now, the array can store 6 elements.
        *  We can say that the size/length of the array is 6

        * ==============================================================
        *                DECLARE AND ALLOCATE
        * ==============================================================
        *                          Syntax
        * dataType arrayName = new dataType[numberElements];
        * */
        String[] countries = new String[6];

        /*
        * ==============================================================
        *                  HOW TO INITIALIZE ARRAYS?
        * ==============================================================
        * We can initialize arrays during declaration
        * ==============================================================
        *                           Syntax
        * Form 1: dataType[] arrayName = {value1, value2, ...}
        * Form 2: arrayName[index] = value;
        * */

        // Form 1
        byte[] ages = {24, 15, 18};

        // Form 2
        String[] cities = new String[5];
        cities[0] = "Los Angeles";
        cities[1] = "San Diego";
        cities[2] = "San Jose";
        cities[3] = "San Fransico";
        cities[4] = "Pittsburg";

        /*
         * ===============================================
         *       HOW TO ACCESS ELEMENTS OF AN ARRAY
         * We can access the element of an array using
         * the index number.
         *        ----------- Syntax -----------
         * array[index]
         * */

        // Accessing each array elements
        System.out.println("Accessing Elements of Array: ");
        System.out.println("First Element: "+cities[0]);
        System.out.println("Second Element: "+cities[1]);
        System.out.println("Third Element: "+cities[2]);
        System.out.println("Fourth Element: "+cities[3]);
        System.out.println("Fifth Element: "+cities[4]);

        // Accessing the whole array using the Arrays Class
        System.out.println(Arrays.toString(cities));
    }
}
