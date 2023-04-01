package javaFundamentals.arrays.oneDimensional.algorithms.methods;
import  java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        String[] bayArea = {"San Franisco", "San Diego", "San José", "Santa Monica"};

        /**
         * This method assigns the specified data type value to each element of the
         * specified range of the specified array.
         */

        System.out.println("Original Bay Area Array: " + Arrays.toString(bayArea);

        // Filling the entire array with "Texas" value
        Arrays.fill(bayArea, "Houston");

        System.out.println("New Bay Area Array: " + Arrays.toString(bayArea) + "\n");

        /**
         * ------------------------------
         * -  We can fill part of array -
         * ------------------------------
         */

        String[] countries = {"COLOMBIA", "USA", "CANADA", "ARGENTINA", "CHILE", "MEXICO", "CHINA", "JAPAN", "KOREA"};
        System.out.println("Original Countries Array: " + Arrays.toString(countries));

        // filling array fom index 1 to index 6
        Arrays.fill(countries, 1, 6, "ENGLAND");
        System.out.println("New Countries Array: " + Arrays.toString(countries) + "\n");

    }
}
