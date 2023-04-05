package javaFundamentals.arrays.oneDimensional.exercises;

import java.util.Random;

public class RandomLetters {
    public static void main(String[] args) {
        var random = new Random();
        int number;
        char letter;

        for (int i = 1; i <= 100; i++) {
            number = random.nextInt(90 - 65 + 1) + 65;
            letter = (char) number;
            System.out.print(letter + " ");
        }
    }
}
