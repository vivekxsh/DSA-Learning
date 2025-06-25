package Recursion;

import java.util.Scanner;

public class lastOccurence {
    static int lOccurence(int arr[], int key, int index) {

        if (index < 0) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return lOccurence(arr, key, index - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value: ");
        int key = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // arr[] = {8,3,6,9,5,10,2,5,3}

        System.out.println("The last occurence found at: " + lOccurence(arr, key, n - 1));

        sc.close();

    }
}
