package Queue.Questions;

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < k + i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            ans.add(max);
        }

        System.out.println(ans);

    }
}
