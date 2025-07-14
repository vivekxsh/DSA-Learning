package Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class pairSum1_bruteForce {

    public static void pairSum(ArrayList<Integer> pair, int target) {

        for (int i = 0; i < pair.size(); i++) {
            for (int j = i + 1; j < pair.size(); j++) {
                if ((pair.get(i) + pair.get(j)) == target) {
                    System.out.println("Pairs are -> " + i + " " + j);
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // int target = 5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in ArrayList: ");
        ArrayList<Integer> pair = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            pair.add(sc.nextInt());
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        pairSum(pair, target);

        sc.close();

    }
}
