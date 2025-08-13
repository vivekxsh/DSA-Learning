package Hashing.HashSet;

import java.util.HashSet;

public class UnionAndIntersection {

    public static void unionOfArray(int arr1[], int arr2[]) {
        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println("Union of arr1 and arr2.");
        System.out.println(union);
        System.out.println(union.size());
    }

    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                ans.add(arr2[i]);
            } else {
                continue;
            }
        }

        System.out.println("Intersection of arr1 and arr2.");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // Union of two array
        unionOfArray(arr1, arr2);

        // intersection of two array
        intersection(arr1, arr2);
    }
}
