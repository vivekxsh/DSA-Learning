package stack.Questions;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int greater[]) {

        int nGreater[] = new int[greater.length];

        Stack<Integer> findGreater = new Stack<>();

        for (int i = greater.length - 1; i >= 0; i--) {
            int element = greater[i];
            while (!findGreater.isEmpty() && findGreater.peek() <= element) {
                findGreater.pop();
            }

            nGreater[i] = findGreater.isEmpty() ? -1 : findGreater.peek();

            findGreater.push(element);
        }

        return nGreater;
    }

    public static void main(String[] args) {
        // int elements[] = { 6, 8, 0, 1, 3 };

        /*
         * 
         * Approach 1 -> Brute force approach
         * 
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter the size of the elements array: ");
         * int n = sc.nextInt();
         * System.out.print("Enter elements in elements array: ");
         * int elements[] = new int[n];
         * for (int i = 0; i < n; i++) {
         * elements[i] = sc.nextInt();
         * }
         * 
         * int nextGreater[] = new int[n];
         * for (int i = 0; i < elements.length; i++) {
         * for (int j = i + 1; j < elements.length; j++) {
         * if (elements[i] < elements[j]) {
         * nextGreater[i] = elements[j];
         * break;
         * } else {
         * nextGreater[i] = -1;
         * }
         * }
         * }
         * nextGreater[n - 1] = -1;
         * 
         * for (int i = 0; i < n; i++) {
         * System.out.print((i < n - 1) ? nextGreater[i] + ", " : nextGreater[i]);
         * }
         * System.out.println();
         * 
         * sc.close();
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array: ");
        int greater[] = new int[n];
        for (int i = 0; i < n; i++) {
            greater[i] = sc.nextInt();
        }

        int nGreater[] = nextGreater(greater);

        for (int i = 0; i < n; i++) {
            System.out.print((i < n - 1) ? nGreater[i] + ", " : nGreater[i]);
        }

        sc.close();

    }
}
