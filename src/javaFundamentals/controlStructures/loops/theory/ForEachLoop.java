package javaFundamentals.controlStructures.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        *  Java for loop has an alternative syntax that makes it easy
        *  to iterate through arrays and collections
        * */

        // create an array
        int[] numbers = {1, 2, 3, 4};
        String[] languages = {"Java", "Python", "C++", "C#"};
        // iterating through the array with for each
        System.out.println("\nIterating numbers array: ");
        for (int number: numbers){
            System.out.println(number);
        }

        System.out.println("\nIterating languages array: ");
        for (String language:languages) {
            System.out.println(language);
        }
    }
}
