package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {

            System.out.println(queue.peek());
            queue.poll();

        }

        System.out.println(queue.isEmpty());

    }
}
