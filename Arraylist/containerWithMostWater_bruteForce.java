package Arraylist;

import java.util.Scanner;

public class containerWithMostWater_bruteForce {

    static int maximumWater(int container[]) {

        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < container.length; i++) {
            int currWater = 0;

            for (int j = i + 1; j < container.length; j++) {

                int length = j - i;
                int width = Math.min(container[i], container[j]);

                if (currWater < (length * width)) {
                    currWater = length * width;
                }

            }

            maxWater = Math.max(maxWater, currWater);
        }

        return maxWater;

    }

    public static void main(String[] args) {

        // int container[] = { 1, 8, 6, 2, 5, 8, 3, 4, 7 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] container = new int[n];

        for (int i = 0; i < n; i++) {
            container[i] = sc.nextInt();
        }

        int maxWater = maximumWater(container);

        System.out.println("The maximum water can be hold is: " + maxWater);

        sc.close();

    }
}
