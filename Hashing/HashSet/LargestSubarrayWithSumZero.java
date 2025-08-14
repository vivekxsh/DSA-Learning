package Hashing.HashSet;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {

    public static int bruteForceLargestSum(int arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                sum += arr[j];
                // c++;
                if (sum == 0) {
                    c = j - i + 1;
                }
            }
            count = Math.max(count, c);

        }

        return count;
    }

    public static int largestSubarray(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String args[]) {

        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        // System.out.println(bruteForceLargestSum(arr));

        System.out.println(largestSubarray(arr));
    }
}
