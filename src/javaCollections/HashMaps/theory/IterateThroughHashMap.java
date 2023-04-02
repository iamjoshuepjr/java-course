package javaCollections.HashMaps.theory;

import java.util.HashMap;
import java.util.Map.Entry;

public class IterateThroughHashMap {
    public static void main(String[] args) {
        /**
         *  To iterate through each entry of the HashMap,
         *  we can use the Java for-each-loop.
         *  We can iterate through keys only, values only, and key/value mapping
         */

        // create a HashMap
        HashMap<String, Integer> population = new HashMap<>();

        // adding values to the HashMap
        population.put("India", 1417173173);
        population.put("China", 125887337);
        population.put("United States", 338289857);
        population.put("Colombia", 52023544);
        population.put("Canada", 38781291);
        population.put("Finland", 5544705);
        population.put("United Kingdom", 67681344);

        // displaying the HashMap
        System.out.println("Population: " + population);

        // iterate through keys only
        System.out.print("Keys/Countries: [");
        byte i = 0;
        for (String country : population.keySet()) {
            if (i < population.size() - 1) {
                System.out.print(country + ", ");
            } else {
                System.out.println(country + "] ");
            }
            i++;
        }

        // iterate through values only
        System.out.print("Values/Population: [");
        i = 0;
        for (Integer country : population.values()) {
            if (i < population.size() - 1) {
                System.out.print(country + ", ");
            } else {
                System.out.println(country + "] ");
            }
            i++;
        }

        // iterate through key/value pairs
        System.out.print("Entries: [");
        i = 0;
        for (Entry<String, Integer> entry : population.entrySet()) {
            if (i < population.size() - 1) {
                System.out.print(entry + ", ");
            } else {
                System.out.println(entry + "] ");
                i++;
            }
        }
    }
}
