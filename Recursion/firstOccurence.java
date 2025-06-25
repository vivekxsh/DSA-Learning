package Recursion;

import java.util.Scanner;

public class firstOccurence {
    public static int fOccurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (key == arr[index]) {
            return index;
        }

        return fOccurence(arr, key, index + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value: ");
        int key = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println("The first occurence of the element found at: " + fOccurence(arr, key, 0));

        sc.close();

    }
}
