package Recursion.problems;

import java.util.Scanner;

public class Question1 {
    static void allOccurence(int arr[], int key, int idx) {

        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        allOccurence(arr, key, idx + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements in the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        allOccurence(arr, key, 0);

        sc.close();

    }

}
