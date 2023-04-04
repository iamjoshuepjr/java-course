package javaFundamentals.arrays.multidimensional.exercises;

import java.util.Arrays;

public class BackwardString {
    public static void main(String[] args) {
        String[][] texts = {
                {"Facebook", "Instagram", "WhatsApp"},
                {"Tesla", "Amazon", "Cisco"}
        };

        var array = texts.length -1;
        var element = texts[array].length;

        String[][] inverse = new String[texts.length][element];

        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < element; j++) {
                inverse[i][j] = texts[array][element - 1 - j];
            }
            array--;
            System.out.println();
        }
        System.out.println(Arrays.deepToString(inverse));
    }
}