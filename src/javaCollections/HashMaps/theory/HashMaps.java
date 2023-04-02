package javaCollections.HashMaps.theory;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        /**
         * The HasMap class of the Java Collection framework provides
         * the functionality of the hash table data structure.
         * It stores elements in key/value pairs.
         * Here, key are unique identifiers used to associate each value on a map.
         * The HasMap class implements the Map interface.
         *
         * ----------------------------------------------
         *                Create a HashMap
         * ----------------------------------------------
         * In order to create a hash map, we must
         * import the java.util.HashMap package. (line 2)
         * Once we import the package, here is how we can
         * create a hashmap in Java.
         *
         * HashMap<K,V> name = new HashMap<>();
         * k -> represents the key type
         * V -> represents the value type
         */

        // creating a HashMap
        HashMap<String, Integer> winners = new HashMap<>();

        /***
         * Adding elements to the Hash Map (dictionary)
         * We are passing the String value "Country" as the key,
         * and the Integer population as the value to the put() method
         */

        winners.put("Real Madrid", 14);
        winners.put("AC Milan", 7);
        winners.put("Bayer Munich", 6);
        winners.put("Liverpool", 6);
        winners.put("Barcelona", 5);
        winners.put("Manchester United", 4);
        winners.put("Ajax", 4);

        // Displaying the Hash Map
        System.out.println("\nMost Champions: " + winners);

        /**+
         * ----------------------------
         *  Accessing HashMap Elements
         * ----------------------------
         * We can use the get() method to access the value from the HashMap
         * Here, get() method takes the key as its argument,
         * and returns the corresponding value associated with the key
         */

        Integer value = winners.get("Real Madrid");
        System.out.println("Real Madrid had won ["+value+"] times UEFA Champions League.");

        /**
         * We can also access the keys, values, and key/value pairs of the hashmap
         * using: keySet(), values(), entrySet() methods respectively.
         */

        // Accessing keys using keySet()
        System.out.println("\nKeys: " + winners.keySet());

        // Accessing values using values()
        System.out.println("Values: " + winners.values());

        // Accessing key/value pairs using entrySet()
        System.out.println("Key Value Mapping" + winners.entrySet());


        /**
         * -------------------------
         *  Changing HashMap Values
         * -------------------------
         * We can use the replace() method to change the value associated with a key in HashMap
         */

        // Change element with key "Manchester United"
        winners.replace("Manchester United", 3);
        System.out.println("\nNew Most Champions:" + winners);

        /**
         * -------------------------
         * Removing HashMap Elements
         * -------------------------
         * To remove elements from a hashmap, we can use the remove() method
         * The remove() method takes the key as its parameter.
         * It returns the value associated with the key and removes the entry.
         */

        // Removing the element associated with the key "Ajax"

        value = winners.remove("Ajax");
        System.out.println("Removed Ajax wit value: " + value);
        System.out.println("Updated HashMap: " + winners);

        // We can also remove the entry only under certain conditions

        winners.remove("Barcelona", 10);
        /*
        * Here, the remove method only removes the entry if the
        * key "Barcelona" is associated with the value 10.
        * */
        System.out.println("New Updated HashMap: " + winners);
    }
}
