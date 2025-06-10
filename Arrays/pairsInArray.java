package Arrays;

import java.util.Scanner;

public class pairsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be in an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements in an array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Pairs in the array are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                System.out.print("( " + arr[i] + ", " + arr[j] + ") " + ",");
            }
            System.out.println();
        }
    }
}
