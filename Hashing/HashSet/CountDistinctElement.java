package Hashing.HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {

        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        HashSet<Integer> arr = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            arr.add(nums[i]);
        }

        System.out.println(arr.size());

        // using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            map.put(nums[i], 0);
        }

        System.out.println(map.size());

    }
}
