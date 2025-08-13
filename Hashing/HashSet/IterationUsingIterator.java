package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterationUsingIterator {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");

        // iteration by using iterator
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // advanced for loop
        for (String item : set) {
            System.out.println(item);
        }
    }
}
