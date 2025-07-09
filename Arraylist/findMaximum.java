package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class findMaximum {

    public static void main(String[] args) {

        // arraylist data = 2 5 9 3 6

        Scanner sc = new Scanner(System.in);

        // ArrayList creation
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter values: ");
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        // *** Method 1 (Using inbuilt functions) ***
        Collections.sort(arr);
        System.out.println("The maximum number is: " + arr.get(arr.size() - 1));

        // *** Method 2 (Manually)***
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }

        System.out.println("Maximum number: " + max);

        sc.close();

    }

}
