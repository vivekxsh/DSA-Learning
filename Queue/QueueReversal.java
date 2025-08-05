package Queue;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueReversal {

    public static void reverseQueue(Queue<Integer> q) {
        System.out.println("Reverse the queue.");
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String[] args) {

        // int element[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be entered in the queue. -> ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the queue.");
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }

        // **************** Calling the reverseQueue function ***********************
        reverseQueue(q);

        // System.out.println("Reverse the elements in the queue.");
        // Stack<Integer> stack = new Stack<>();
        // while (!q.isEmpty()) {
        // stack.push(q.remove());
        // }

        // while (!stack.isEmpty()) {
        // q.add(stack.pop());
        // }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        sc.close();

    }
}
