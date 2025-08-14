package Hashing.HashSet;

import java.util.HashMap;

public class SumEqualsToK {
    public static int countEqualsK(int arr[], int k) { // O(n)

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3 };
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = 10;

        System.out.println(countEqualsK(arr, k));
    }
}
