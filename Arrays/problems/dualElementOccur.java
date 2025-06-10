package Arrays.problems;

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
