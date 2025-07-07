package DivideAndConquer;

import java.util.Scanner;

public class rotatedArraySearch {

    public static int targetIdx(int arr[], int tar, int si, int ei) {

        // base case
        if (si > ei) {
            return -1;
        }

        // kaam
        // find mid
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return targetIdx(arr, tar, si, mid - 1);
            }
            // case b : right
            else {
                return targetIdx(arr, tar, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return targetIdx(arr, tar, mid + 1, ei);
            }
            // case d : left
            else {
                return targetIdx(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {

        // int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        // int target = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value to find in the array: ");
        int target = sc.nextInt();

        int tarIdx = targetIdx(arr, target, 0, n - 1);

        System.out.println(tarIdx);

        sc.close();

    }
}
