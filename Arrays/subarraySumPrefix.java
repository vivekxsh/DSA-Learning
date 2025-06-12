package Arrays;

import java.util.Scanner;

public class subarraySumPrefix {

    public static void sum(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i + 1; j < n; j++) {
                int end = j;

                currentSum = 0;

                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int arr[] = { 1, -2, 6, -1, 3 };
        sum(arr);

        sc.close();
    }
}
