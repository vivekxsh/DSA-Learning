package Arraylist;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // data = 2 5 9 3 6

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        System.out.println(arr);

        // sorting in ascending order
        Collections.sort(arr);
        System.out.println("Sorted in ascending order.");
        System.out.println(arr);

        // sorting in descending order
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted in descending order.");
        System.out.println(arr);
    }
}
