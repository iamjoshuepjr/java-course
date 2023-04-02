package javaFundamentals.arrayList;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        /*
        * ------------------------------------------------------------
        *                         Arraylist
        * ------------------------------------------------------------
        * The ArrayList class is a resizable array, which can be found
        * in the java.util package.
        * The difference between a built-in array and an ArrayList is
        * that the size of an array cannot be modified
        * (if you want to add or remove elements to/from an array,
        * you have to create a new one), while elements can be added and
        * removed from an ArrayList whenever you want.
        * The syntax is also slightly different. */

        ArrayList<String> backEndTools = new ArrayList<String>();

        /***
         * The ArrayList class has many useful methods
         *
         * Adding elements to the list
         * To add elements to the ArrayList, use the .add() method
         */

        backEndTools.add("Java");
        backEndTools.add("Python");
        backEndTools.add("Spring");
        backEndTools.add("Django");
        backEndTools.add("MySQL");
        backEndTools.add("MongoDB");

        System.out.println(backEndTools);

        /**
         * Accessing elements
         * To access an element in the ArrayList, use the .get() method
         * and refer to the index number
         */
        String index = backEndTools.get(3);
        System.out.println(index);

        /**
         * Changing Elements
         * To modify an element, use the .set() method
         * and refer to the index number
         */

        backEndTools.set(4, "Node.js");
        System.out.println("New ArrayList: " +backEndTools);

        /***
         * Remove and element
         * To remove and element, use the .remove() element
         * and refer to the index number
         */

        backEndTools.remove(4);
        System.out.println("New ArrayList: " +backEndTools);

        /***
         * ArrayList Size
         * To find out how many elements an ArrayList has, use the .size() method
         */

        System.out.println("ArrayList size: ["+backEndTools.size()+"] elements");

        /**
         * Loop Through an ArrayList
         * Loop through the elements+ of an+ ArrayList with a for loop, and use the size method
         * to specify how many times the loop should run
         */

        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Georgia");
        states.add("Kansas");
        states.add("Washington");

        for (int i = 0; i < states.size(); i++) {
            System.out.println("State: " + states.get(i));
        }
    }
}
