package Arrays;

import java.util.Scanner;

public class reverseArray {
    public static void reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);

        System.out.print("\nThe revered array is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
