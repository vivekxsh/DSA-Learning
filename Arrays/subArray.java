package Arrays;

import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subarrays of the given array are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(")");
                System.out.println();
            }
            System.out.println("-------------------");
        }

        sc.close();
    }
}
