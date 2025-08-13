package Hashing.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(50);
        tSet.add(10);
        tSet.add(30);
        tSet.add(20);
        tSet.add(40);
        tSet.add(30);

        System.out.println(tSet.first());
        System.out.println(tSet.last());
        System.out.println(tSet.higher(25));
        System.out.println(tSet.lower(30));

        System.out.println(tSet);

        @SuppressWarnings("rawtypes")
        Iterator it = tSet.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        TreeSet<String> ts = new TreeSet<>();

        // Always store data in sorted order
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Guava");
        ts.add("Orange");
        System.out.println(ts);

    }
}
