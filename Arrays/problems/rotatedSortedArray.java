package Arrays.problems;

import java.util.Scanner;

public class rotatedSortedArray {
    // Function to find the pivot in a rotated sorted array

    static int indexOfElement(int arr[], int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] >= arr[lo]) {
                if (target >= arr[lo] && target < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            else {
                if (target > arr[mid] && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the rotated sorted array: ");
        int n = sc.nextInt();

        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int arr[] = new int[n];
        System.out.print("Enter the elements in the rotated sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();

        int index = indexOfElement(arr, target);

        if (target == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        sc.close();

    }
}
