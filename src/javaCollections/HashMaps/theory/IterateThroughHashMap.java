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
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        // adding values to the HashMap
        countryPopulation.put("India", 1417173173);
        countryPopulation.put("China", 125887337);
        countryPopulation.put("United States", 338289857);
        countryPopulation.put("Colombia", 52023544);
        countryPopulation.put("Canada", 38781291);
        countryPopulation.put("Finland", 5544705);
        countryPopulation.put("United Kingdom", 67681344);

        // displaying the HashMap
        System.out.println("Population: " + countryPopulation);

        // iterate through keys only
        System.out.print("Keys/Countries: [");
        byte i = 0;
        for (String country : countryPopulation.keySet()) {
            if (i < countryPopulation.size() - 1) {
                System.out.print(country + ", ");
            } else {
                System.out.println(country + "] ");
            }
            i++;
        }

        // iterate through values only
        System.out.print("Values/Population: [");
        i = 0;
        for (Integer country : countryPopulation.values()) {
            if (i < countryPopulation.size() - 1) {
                System.out.print(country + ", ");
            } else {
                System.out.println(country + "] ");
            }
            i++;
        }

        // iterate through key/value pairs
        System.out.print("Entries: [");
        i = 0;
        for (Entry<String, Integer> entry : countryPopulation.entrySet()) {
            if (i < countryPopulation.size() - 1) {
                System.out.print(entry + ", ");
            } else {
                System.out.println(entry + "] ");
            }
            i++;
        }

        // for each method
        System.out.println("\nCountry Population Millions");
        countryPopulation.forEach((country, population) ->{
            System.out.println(country +" - "+ population );
            countryPopulation.replace(country, population - 20000000);
        });
        System.out.println(countryPopulation.toString());
    }
}
