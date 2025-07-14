package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class pairSum1_2pointer {

    static void pairSum1(ArrayList<Integer> pair, int target) {

        int left = 0, right = pair.size() - 1;

        while (left < right) {
            int sum = pair.get(left) + pair.get(right);

            if (sum == target) {
                System.out.println("Pair is: " + left + " " + right);
                return;
            }

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            }
        }

    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // int target = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arraylist: ");
        int n = sc.nextInt();

        System.out.println("Enter element: ");
        ArrayList<Integer> pair = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pair.add(sc.nextInt());
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        pairSum1(pair, target);

        sc.close();

    }
}
