package Queue;

public class QueueArrayImplementation {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty() function
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add function
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove function
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;

            return front;
        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.isEmpty();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        // System.out.println(queue.peek());

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.size);
        // System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }

        queue.peek();

    }
}
