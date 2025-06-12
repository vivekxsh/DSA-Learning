package Arrays;

import java.util.Scanner;

public class maxSubSum {

    public static void maxSum(int[] arr) {
        int n = arr.length;
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                System.out.println("current sum: " + currentSum);
                if (sum < currentSum) {
                    sum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSum(arr);

        sc.close();
    }
}
