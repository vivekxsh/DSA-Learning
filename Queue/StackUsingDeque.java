package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {

        Deque<Integer> deque = new LinkedList<>();

        // isEmpty function
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // push operation
        public void push(int data) {
            deque.addLast(data);
        }

        // pop operation
        public int pop() {
            return deque.removeLast();
        }

        // peek operation
        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
