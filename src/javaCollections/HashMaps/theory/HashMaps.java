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
        HashMap<String, Integer> population = new HashMap<>();

        /***
         * Adding elements to the Hash Map (dictionary)
         * We are passing the String value "Country" as the key,
         * and the Integer population as the value to the put() method
         */

        population.put("Colombia", 50_882_891);
        population.put("United States", 331_449_281);
        population.put("England", 56_286_961);

        // Displaying the Hash Map
        System.out.println("Population: " + population);

        
    }
}
