package Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> country = new HashMap<>();
        // insert operation
        country.put("India", 100);
        country.put("China", 150);
        country.put("US", 50);
        country.put("Indonesia", 6);
        country.put("Bhutan", 5);

        System.out.println(country);

        // Iteration on HashMap
        Set<String> keys = country.keySet();

        for (String key : keys) {
            System.out.println(key + " => " + country.get(key));
        }

    }
}
