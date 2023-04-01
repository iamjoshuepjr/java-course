package javaFundamentals.arrays.oneDimensional.algorithms.methods;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        /**
         * .copyOf() method copies the specified array, truncating or padding with false (if necessary)
         * so the copy has the specified length.
         */

        String[] states = {"California", "Alabama", "Georgia", "Kansas", "Washington"};

        System.out.println("Original States Array: " + Arrays.toString(states));

        // copying original states array to copy states array with (=) operator
        // If the original array is changed, this will display the changes in both arrays

        String[] copyStates = states;
        System.out.println("Copy States Array: " + Arrays.toString(copyStates));

        // changing elements to the original array
        Arrays.fill(states, "Ontario");

        // displaying both arrays
        System.out.println("\nNew Original States Array: " + Arrays.toString(states));
        System.out.println("New Copy States Array: " + Arrays.toString(copyStates) + "\n");

        // copying original states array to copy states array with .copyOf() method
        // If the original array is changed, only the original array will be changed

        String[] companies = {"Amazon", "Tesla", "Meta", "Microsoft"};
        System.out.println("Original Companies Array: " + Arrays.toString(companies));

        String[] copyCompanies = Arrays.copyOf(companies, companies.length);
        System.out.println("Copy Companies Array: " + Arrays.toString(copyCompanies));

        // changing elements to the original array
        Arrays.fill(companies, "Google");

        // displaying both arrays
        System.out.println("\nNew Original States Array: " + Arrays.toString(companies));
        System.out.println("New Copy States Array: " + Arrays.toString(copyCompanies));
    }
}
