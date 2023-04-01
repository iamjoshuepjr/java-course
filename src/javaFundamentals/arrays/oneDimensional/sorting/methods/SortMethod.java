package javaFundamentals.arrays.oneDimensional.sorting.methods;

/***
 * Array class is a class containing static methods that are used with arrays to
 * + search
 * + sort
 * + compare
 * + insert elements
 * + return a string representation
 *
 */

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        char vowels[] = {'e', 'u', 'o', 'i', 'a' };
        System.out.println("The original vowels array: " + Arrays.toString(vowels));

        // using the .sort() method to sort it
        Arrays.sort(vowels);

        // The sorted array
        System.out.println("The sorted vowels array: " + Arrays.toString(vowels));

        byte ages[] = {23, 44, 18, 24, 15, 56, 99, 23};
        System.out.println("The original ages array: " + Arrays.toString(ages));
        System.out.println("Length: " + ages.length);

        // using .sort() method to sort in a specific range
        Arrays.sort(ages, 2, 7);
        System.out.println("The sorted ages array between indexes 2 - 7 : " + Arrays.toString(ages));
    }
}
