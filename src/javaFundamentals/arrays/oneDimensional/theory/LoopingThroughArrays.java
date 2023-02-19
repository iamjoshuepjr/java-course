package javaFundamentals.arrays.oneDimensional.theory;

public class LoopingThroughArrays {
    public static void main(String[] args) {
        // We can also loop through each element of the array

        // create an array
        byte[] ages = {24, 15, 18};

        // Looping Through array using for loop
        System.out.println("Looping Array using for loop: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // create another array
        String[] languages = {"Java", "Python", "JavaScript"};

        // Looping through array using for-each loop
        System.out.println("Looping Array using for-each loop: ");
        for (String language:languages) {
            System.out.println(language);
        }
    }
}
