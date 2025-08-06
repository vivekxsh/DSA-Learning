#### Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input:
nums = [1, 2, 3, 1]
Output: true

Example 2:
Input:
nums = [1, 2, 3, 4]
Output: false

```java

import java.util.Scanner;
import java.util.Arrays;

public class dualElementOccur {

    static boolean dualOccur(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return false;
        }

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (dualOccur(arr)) {
            System.out.println("Yes, there are elements that occur more than once in the array.");
        } else {
            System.out.println("No, there are no elements that occur more than once int the array.");
        }

        sc.close();
    }
}
```

#### -> Question 2: Find the index of an element in a rotated sorted array

Example 1: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0 Output: 4
Example 2: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3 Output: -1

```java

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
```
