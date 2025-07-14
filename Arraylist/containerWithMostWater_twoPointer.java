package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class containerWithMostWater_twoPointer {

    static int containerWithMostWater(ArrayList<Integer> container) {

        int mostWater = 0;
        int left = 0, right = container.size() - 1;

        while (left < right) {

            int minHt = Math.min(container.get(left), container.get(right));
            int width = right - left;

            mostWater = Math.max(mostWater, (minHt * width));

            if (container.get(left) < container.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return mostWater;

    }

    public static void main(String[] args) {
        // int container[] = { 1, 8, 6, 2, 5, 8, 3, 4, 7 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = sc.nextInt();

        System.out.println("Enter elements in ArrayList: ");

        ArrayList<Integer> container = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            container.add(sc.nextInt());
        }

        int mostWater = containerWithMostWater(container);

        System.out.println("Container with most water: " + mostWater);

        sc.close();

    }
}
