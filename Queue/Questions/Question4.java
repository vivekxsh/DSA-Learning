package Queue.Questions;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class Question4 {
    public static void reverseQueue(Queue<Integer> q, int k) {

        int size = q.size();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the queue: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into queue.");
        Queue<Integer> q = new LinkedList<>();

        while (n-- > 0) {
            q.add(sc.nextInt());
        }

        System.out.print("Enter the k value upto it has to reverse: ");
        int k = sc.nextInt();

        reverseQueue(q, k);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        sc.close();

    }
}
