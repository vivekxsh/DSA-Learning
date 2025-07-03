package DivideAndConquer;

import java.util.Scanner;

public class quickSort {

    public static void quicksort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);

        quicksort(arr, si, pIdx - 1);
        quicksort(arr, pIdx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 8, 2, 5 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in the array.");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("After using quicksort.");
        quicksort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();

    }
}
