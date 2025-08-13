package Hashing.HashSet;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        if (set.contains("Banana")) {
            System.out.println("Banana is present.");
        }

        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println(set);
    }
}
