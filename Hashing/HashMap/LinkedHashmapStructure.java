package Hashing.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashmapStructure {
    public static void main(String[] args) {

        // LinkedHashMap is mainly used to keep the insertion order internal data
        // structure is -> Doubly LinkedList
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
