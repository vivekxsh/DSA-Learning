package Hashing.HashMap;

import java.util.TreeMap;

public class TreeMapStructure {

    public static void main(String[] args) {

        // it keeps the keys in the sorted order and the internal data used is ->
        // Red-Black Tree
        TreeMap<String, Integer> treemap = new TreeMap<>();

        treemap.put("India", 100);
        treemap.put("China", 150);
        treemap.put("US", 50);

        System.out.println(treemap);
    }

}
