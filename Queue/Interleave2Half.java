package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Interleave2Half {

    public static void interleave(Queue<Integer> q) {

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!q.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int n = arr.length;

        // **************************** By using Stack *****************************
        // Stack<Integer> stack1 = new Stack<>();
        // Stack<Integer> stack2 = new Stack<>();

        // for (int i = 0; i < n; i++) {
        // if (i < n / 2) {
        // stack1.push(arr[i]);
        // } else {
        // stack2.push(arr[i]);
        // }
        // }

        // Stack<Integer> ans = new Stack<>();
        // while (!stack1.isEmpty() && !stack2.isEmpty()) {
        // ans.push(stack2.pop());
        // ans.push(stack1.pop());
        // }

        // while (!ans.isEmpty()) {
        // System.out.print(ans.pop() + " ");
        // }

        // System.out.println();

        // ****************************** By using Queue
        // *****************************************
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be get added into Queue: ");
        int n = sc.nextInt();
        Queue<Integer> element = new LinkedList<>();

        System.out.println("Enter elements into queue one after another.");
        for (int i = 0; i < n; i++) {
            element.offer(sc.nextInt());
        }

        int size = element.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.offer(element.remove());
        }

        Queue<Integer> finalAns = new LinkedList<>();

        while (!firstHalf.isEmpty() && !element.isEmpty()) {
            finalAns.add(firstHalf.remove());
            finalAns.add(element.remove());
        }

        System.out.println("The final interleaved elements are: ");
        while (!finalAns.isEmpty()) {
            System.out.print(finalAns.peek() + " ");
            finalAns.remove();
        }

        sc.close();

    }
}
