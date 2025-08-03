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

### Queue implementation using Linkedlist

![Queue implementation](images/image2.png)

---

```java
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
```

---

### Queue implementation using JCF -> Java Collection Framework

To implement a **Queue** using **Java Collections Framework (JCF)**, you typically use the `Queue` interface, with classes like `LinkedList` or `ArrayDeque` providing the actual implementation.

Here’s a simple example using `LinkedList`, which is the most straightforward way to implement a queue:

---

### ✅ Queue using Java Collections Framework

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Peek (view the front element)
        System.out.println("Front element: " + queue.peek());

        // Dequeue (remove elements)
        System.out.println("Removed: " + queue.remove());

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);
    }
}
```

---

### 🔍 Output:

```
Queue: [Alice, Bob, Charlie]
Front element: Alice
Removed: Alice
Queue after removal: [Bob, Charlie]
```

---

### 🧠 Notes:

- `add()` – Adds an element to the rear of the queue.
- `peek()` – Returns the head of the queue without removing it.
- `remove()` – Removes the head of the queue and returns it.

You can also use `ArrayDeque` for a more performant, non-thread-safe queue implementation:

```java
Queue<String> queue = new ArrayDeque<>();
```

---

### Queue (Interface) implementation using LinkedList (class) vs ArrayDeque (class)

The main differences between implementing a **Queue** using **`LinkedList`** vs **`ArrayDeque`** in Java lie in **performance**, **memory usage**, and **suitability for queue operations**.

Here's a breakdown:

---

### ✅ **1. Class Hierarchy & Usage**

| Feature      | `LinkedList`                            | `ArrayDeque`                    |
| ------------ | --------------------------------------- | ------------------------------- |
| Implements   | `List`, `Deque`, `Queue`                | `Deque`, `Queue`                |
| Backed by    | Doubly-linked list                      | Resizable circular array        |
| Suitable for | General-purpose queue + list operations | Fast queue and stack operations |

---

### ✅ **2. Performance Comparison**

| Operation        | `LinkedList`         | `ArrayDeque`                 |
| ---------------- | -------------------- | ---------------------------- |
| Enqueue (add)    | O(1)                 | O(1) amortized               |
| Dequeue (remove) | O(1)                 | O(1) amortized               |
| Random access    | O(n)                 | O(1) (not allowed via index) |
| Memory usage     | More (node pointers) | Less (compact array)         |

- `ArrayDeque` is generally **faster and more memory-efficient** than `LinkedList` for queue operations.
- `LinkedList` allows for **more flexibility** (like bidirectional traversal, or using it as a list), but at a **cost of performance and memory**.

---

### ✅ **3. Practical Considerations**

| Aspect                | `LinkedList`                        | `ArrayDeque`                         |
| --------------------- | ----------------------------------- | ------------------------------------ |
| Thread-safe?          | ❌ (Not thread-safe)                | ❌ (Not thread-safe)                 |
| Allows null elements? | ✅ Yes                              | ❌ No                                |
| Better for            | Linked data access                  | Fast FIFO or LIFO (Stack) operations |
| Memory overhead       | High (stores two pointers per node) | Low (just a growing array)           |

---

### ✅ **Code Snippet Comparison**

**LinkedList:**

```java
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.remove();
```

**ArrayDeque:**

```java
Queue<String> queue = new ArrayDeque<>();
queue.add("A");
queue.remove();
```

---

### 🧠 Which One to Use?

- ✅ Use **`ArrayDeque`** when:

  - You only need **queue or stack operations**.
  - You want **better performance** and **lower memory usage**.

- ❗ Avoid **`LinkedList`** unless:
  - You need **list-like behavior** or **frequent insertions/removals in the middle** (which Queue doesn't typically need).

---
