package Queue;

public class QueueLinkedlistImplementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty function
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add function
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove function
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int front = head.data;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return head.data;
        }
    }

    @SuppressWarnings("static-access")

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {

            System.out.println(queue.peek());
            queue.remove();

        }
    }
}
