package sorting;

import java.util.Scanner;
import java.util.Arrays;

public class inbuiltSort {
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // -> O(nlogn)
        System.out.println("Sorted by using inbuilt function: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
