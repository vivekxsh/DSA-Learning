package Hashing.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static int majorityElementBruteForce(int arr[]) {

        Arrays.sort(arr);

        int count = 1;
        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (element == arr[i]) {
                count++;
                if (count >= arr.length / 2) {
                    return arr[i];
                }
            }

            else {
                element = arr[i];
                count = 1;
            }
        }

        return -1;
    }

    public static int majorityElementHashMap(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= arr.length / 2) {
                return entry.getKey();
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        // int arr[] = { 1, 2, 1, 2 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements in arry.");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElementBruteForce(arr));

        System.out.println(majorityElementHashMap(arr));

        sc.close();

    }
}
