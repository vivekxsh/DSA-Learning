package Hashing.HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap<>();

        // -> to add data into HashMap we use put operation
        country.put("India", 150);
        country.put("Srilanka", 100);
        country.put("China", 200);
        country.put("Bhutan", 50);

        // -> get the element
        System.out.println(country.get("India"));

        // -> check whether it contains key or not
        System.out.println(country.containsKey("China"));
        System.out.println(country.containsValue(50));

        // -> remove entry with the help of key
        System.out.println(country.remove("Bhutan"));

        System.out.println(country.containsKey("Bhutan"));

        for (String key : country.keySet()) {
            System.out.println(key + " => " + country.get(key));
        }

    }
}
