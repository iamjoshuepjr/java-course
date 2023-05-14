package javaSubroutines.theory.parameters;
import java.util.Arrays;

public class ArraysAsAParameter {
    public static int[] array, reversed;

    public static void main(String[] args) {
        array = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array\n" + Arrays.toString(array));
        reversed = reverse(array);
        System.out.println("Inverted Array\n" + Arrays.toString(reversed));
    }

    public static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[arr.length - i - 1] = arr[i];
        }
        return reversed;
    }
}