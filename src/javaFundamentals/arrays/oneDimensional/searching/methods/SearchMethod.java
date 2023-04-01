package javaFundamentals.arrays.oneDimensional.searching.methods;
import java.util.Arrays;

public class SearchMethod {
    public static void main(String[] args) {
        byte ages[] = {12, 2, 24, 51, 19, 15};
        System.out.println("The original ages array: " + Arrays.toString(ages));

        // sorting
        Arrays.sort(ages);
        System.out.println("The sorted ages array: " + Arrays.toString(ages));

        // searching
        byte key = 15;
        int index = Arrays.binarySearch(ages, key);
        System.out.println("The age " +key+ " was found at ["+index+"] position!");
    }
}