package Arrays;

import java.util.Scanner;

public class maxSubarrayKadanes {

    static void kadanesSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = { 1, -2, 6, -1, 3 };
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        kadanesSum(arr);
        sc.close();
    }
}
