package Heaps.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectNRopes {

    public static int connectRopes(int arr[]) {
        int totalCost = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            int cost = first + second;

            totalCost = totalCost + cost;

            pq.add(cost);
        }

        return totalCost;

    }

    public static void main(String[] args) {

        // int ropes[] = { 4, 3, 2, 6 };
        // int ropes[] = { 2, 3, 3, 4, 6 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the ropes array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements into ropes array.");

        int ropes[] = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        System.out.println("cost of connecting n ropes is: " + connectRopes(ropes));

        sc.close();

    }
}
