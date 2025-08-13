package Hashing.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {

        LinkedHashSet<String> lSet = new LinkedHashSet<>();

        lSet.add("Apple");
        lSet.add("Mango");
        lSet.add("Guave");
        lSet.add("Orange");

        System.out.println(lSet);

        @SuppressWarnings("rawtypes")
        Iterator it = lSet.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(lSet.remove("Apple"));
        System.out.println(lSet);

    }
}
