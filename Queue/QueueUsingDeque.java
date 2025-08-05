package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // isEmpty function
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // add function
        public void add(int data) {
            deque.addLast(data);
        }

        // remove function
        public int remove() {
            return deque.removeFirst();
        }

        // peek function
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.isEmpty();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
