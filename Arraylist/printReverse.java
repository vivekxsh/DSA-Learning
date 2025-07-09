package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class printReverse {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        // print reverse of arraylist
        // for (int i = arr.size() - 1; i >= 0; i--) {
        // System.out.print(arr.get(i) + " ");
        // }

        Collections.reverse(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
