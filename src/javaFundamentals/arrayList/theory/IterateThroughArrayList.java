package javaFundamentals.arrayList.theory;

import java.util.ArrayList;

public class IterateThroughArrayList {
    public static void main(String[] args) {
        /**
         * Loop Through an ArrayList
         * Loop through the elements of an ArrayList with a for loop, and use the size method
         * to specify how many times the loop should run
         */

        // Way 1
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Georgia");
        states.add("Kansas");
        states.add("Washington");

        System.out.print("States [");
        for (int i = 0; i < states.size(); i++) {
            if(i < states.size() - 1)
            {
                System.out.print(states.get(i) + ", ");
            } else {
                System.out.println(states.get(i) + "] ");
            }
        }

        // Way 2
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("C#");
        languages.add(2, "C++");

        System.out.print("Languages [");
        byte i = 0;
        for (String language: languages) {
            if(i < languages.size() - 1){
                System.out.print(language + ", ");
            }
            else {
                System.out.println(language + "] ");
            }
            i++;
        }

        // Way 3
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(15);
        numbers.add(18);
        numbers.add(24);
        numbers.add(28);
        numbers.add(3, 20);

        System.out.println("Before: " +  numbers.toString());
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println("After: " +  numbers.toString());
    }
}
