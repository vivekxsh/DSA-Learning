### Queue -> FIFO

A **Queue** in Java is a linear data structure that follows the **First-In-First-Out (FIFO)** principle — the element that is added first is removed first. It's useful for scenarios like task scheduling, buffering, and breadth-first search.

![queue](images/image.png)

---

### 🧱 Queue Basics in Java

Java provides the `Queue` interface in the `java.util` package. It is typically implemented using classes like:

- `LinkedList`
- `PriorityQueue`
- `ArrayDeque`

> `Queue` is an interface, so you cannot instantiate it directly.

---

![queue](images/image1.png)

---

### ✅ Key Methods in `Queue` Interface

| Method      | Description                                                     |
| ----------- | --------------------------------------------------------------- |
| `add()`     | Inserts the element. Throws exception if fails.                 |
| `offer()`   | Inserts the element. Returns false if fails.                    |
| `remove()`  | Removes and returns the head. Throws exception if empty.        |
| `poll()`    | Removes and returns the head. Returns null if empty.            |
| `element()` | Retrieves, doesn't remove, the head. Throws exception if empty. |
| `peek()`    | Retrieves, doesn't remove, the head. Returns null if empty.     |

---

### 🧠 When to Use a Queue?

- Print job scheduling
- CPU or disk scheduling
- Asynchronous data transfer (like I/O buffers)
- BFS (Breadth-First Search)

---

### Queue implementation using Array

```java
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
```

---
