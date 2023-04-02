package collections.arrayList.theory;
import javax.swing.JOptionPane;
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
         * ---------------------------------------------------------
         *              Adding elements to the list
         * ---------------------------------------------------------

         * ---------------
         *  .add() method
         * ---------------
         * The .add() method adds an item to the end of the list
         * syntax: list.add(element);
         */

        backEndTools.add("Java");
        backEndTools.add("Python");
        backEndTools.add("Spring");
        backEndTools.add("Django");
        backEndTools.add("MySQL");
        backEndTools.add("MongoDB");
        JOptionPane.showMessageDialog(null, "Displaying ArrayList!");
        JOptionPane.showMessageDialog(null, "Back End Tools Array: " + backEndTools);

        /**
         * -----------------
         * .add(i, element);
         * ------------------
         * The .add() method inserts an element to the list at the specified index
         * The .add() method takes two parameters:
         *  - index (where the element needs to be inserted)
         *  - element (the element to be inserted in the list)
         *            Syntax: list.add(i, element)
         */

        backEndTools.add(1, "C#");
        /**
         * ----------------------------------------------------------------
         *                      Accessing elements
         * ----------------------------------------------------------------
         * To access an element in the ArrayList, use the .get() method
         * and refer to the index number
         */
        String index = backEndTools.get(3);
        JOptionPane.showMessageDialog(null, "Element at [3] index: [" +index+ "]");

        /**
         * Changing Elements
         * To modify an element, use the .set() method
         * and refer to the index number
         */
        String toChange = "MySQL";
        String changed = "Node.js";

        JOptionPane.showMessageDialog(null, "Element to Change: ["+toChange+"] -> Changed to ["+changed+"]");
        backEndTools.set(4, changed);
        JOptionPane.showMessageDialog(null, "New ArrayList: " +backEndTools);

        /***
         * Remove and element
         * To remove and element, use the .remove() element
         * and refer to the index number
         */
        byte toRemove = 4;
        JOptionPane.showMessageDialog(null, "Element to Remove: ["+backEndTools.get(toRemove)+"]");
        backEndTools.remove(toRemove);
        JOptionPane.showMessageDialog(null, "New ArrayList: " +backEndTools);

        /***
         * ArrayList Size
         * To find out how many elements an ArrayList has, use the .size() method
         */

        JOptionPane.showMessageDialog(null, "ArrayList size: ["+backEndTools.size()+"] elements");

        ArrayList<String> countries = new ArrayList<String>();

        countries.add("Colombia");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Argentina");
        countries.add("Chile");
        countries.add("Mexico");
        countries.add("China");
        countries.add("Japan");
        countries.add("Korea");

        System.out.println("Countries Array: " + countries);
        System.out.println("Countries Array Size ["+countries.size()+"]");


        /**
         * Insert a new element
         */

        countries.set(6, String.valueOf("Netherlands"));
        System.out.println("New Countries Array: " + countries);

        countries.clear();
        System.out.println("Countries Array Deleted: " + countries.toString());
    }
}