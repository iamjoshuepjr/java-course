package javaFundamentals.arrays.multidimensional.theory;

public class Arrays {
    public static void main(String[] args) {
        /**
         * ======================================================================
         *                             MULTIDIMENSIONAL ARRAYS
         * A two-dimensional array can be seen as an array of arrays,
         * where each element of the main array holds another array of elements.
         * Each of these sub-arrays has a fixed number of elements,
         * and can be accessed using both a row and column index.
         *
         * ============================================================
         *           HOW TO DECLARE A 2D ARRAY IN JAVA?
         * ============================================================
         *                            Syntax
         *  dataType[][] arrayName;
         *  dataType - it can be primitive data types or java objects
         *  arrayName - it is an identifier
         * */

        // Declare a 2D array manually
        short[][] codes;

        /*
         * ===========================================================
         *         HOW MANY ELEMENTS CAN A 2D ARRAY THIS HOLD?
         * ==========================================================
         * To define the number of elements that a 2D array can hold,
         * we have to allocate memory for the array.
         * ==========================================================
         *                        Syntax
         * arrayName = new dataType[numberArray][numberElements];
         *
         */

        codes = new short[3][3];

        /*
         * Now, the array can store 9 elements.
         * The total numbers of elements that can be stored in a multidimensional array can be calculated
         * by multiplying the size of all the dimensions.
         *
         * ==============================================================
         *                DECLARE AND ALLOCATE
         * ==============================================================
         *                          Syntax
         * dataType[][] arrayName = new dataType[numberArrays][numberElements];
         * */

        byte[][] ages = new byte[3][3];

        /*
         * ==============================================================
         *                  HOW TO INITIALIZE A 2D ARRAY?
         * ==============================================================
         * We can initialize arrays during declaration
         * ==============================================================
         *                           Syntax
         * Form 1: dataType[][] arrayName = {{value1, value2, ...}, {value1, value2, ...}, {value1, value2, ...}}
         * Form 2: arrayName[indexArray][indexElement] = value;
         * */

        // Form 1
        String[][] countries = {
                {"USA", "Washington D.C.", "English", "USD"},
                {"Canada", "Ottawa", "English, French", "CAD"},
                {"Colombia", "Bogota", "Spanish", "COP"}
        };

        // Form 2
        // ages[3][3]
        // [0] it's the first array which has three elements
        ages[0][0] = 15;
        ages[0][1] = 24;
        ages[0][2] = 18;
        // [1] it's the second array which has three elements
        ages[1][0] = 26;
        ages[1][1] = 13;
        ages[1][2] = 34;
        // [0] it's the third array which has three elements
        ages[2][0] = 46;
        ages[2][1] = 35;
        ages[2][2] = 25;

        /*
         * ===============================================
         *     HOW TO ACCESS ELEMENTS OF A 2D ARRAY
         * We can access the element of an array using
         * the indexes number.
         *        ----------- Syntax -----------
         * array[array][index]
         * */

        // Accessing each array element
        System.out.println("Accessing Elements of 2D Array");
        System.out.println("\n-----------");
        System.out.println("- Array 1 -");
        System.out.println("-----------");
        System.out.println("index[0] " + ages[0][0]);
        System.out.println("index[1] " + ages[0][1]);
        System.out.println("index[2] " + ages[0][2]);
        System.out.println("\n-----------");
        System.out.println("- Array 2 -");
        System.out.println("-----------");
        System.out.println("index[0] " + ages[1][0]);
        System.out.println("index[1] " + ages[1][1]);
        System.out.println("index[2] " + ages[1][2]);
        System.out.println("\n-----------");
        System.out.println("- Array 3 -");
        System.out.println("-----------");
        System.out.println("index[0] " + ages[2][0]);
        System.out.println("index[1] " + ages[2][1]);
        System.out.println("index[2] " + ages[2][2]);
    }
}