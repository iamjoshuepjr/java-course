package javaFundamentals.arrays.oneDimensional.exercises;

import java.util.Arrays;
import java.util.Random;

public class UniqueRandomNumbers {
    public static void main(String[] args) {
        var random = new Random();
        int number, j, count = 0;
        int[] uniqueArray = new int[10];


        for(int i = 0; i < 10; i++){
            number = random.nextInt(10);
            j = 0;
            while (j < i){
                count++;
                if(uniqueArray[j] == number){
                    j = 0;
                    number = random.nextInt(10);
                } else {
                    j++;
                }
            }

            uniqueArray[i] = number;
        }

        System.out.println(Arrays.toString(uniqueArray));
        System.out.println("Number of iterations ["+count+"]");
    }
}
