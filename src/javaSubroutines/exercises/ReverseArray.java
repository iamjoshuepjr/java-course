package javaSubroutines.exercises;

import java.util.Arrays;

public class ReverseArray {
    public static int[] array, reverse;

    public static void main(String[] args) {
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        reverse = reverseArray(array);
        System.out.println(Arrays.toString(reverse));
    }

    public static int[] reverseArray(int[] array){
        int[] reverse = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[array.length - i - 1] = array[i];
        }
        return reverse;
    }
}