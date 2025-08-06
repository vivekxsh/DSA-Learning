### PriorityQueue in java

In Java, `PriorityQueue` is a part of the **Java Collections Framework** and is found in the `java.util` package. It is a **queue** data structure where elements are ordered according to their **natural ordering** or by a **custom comparator** provided at the time of queue construction.

### ✅ Key Features:

- **Implements**: `Queue<E>`, `Collection<E>`
- **Underlying structure**: Binary heap (usually a min-heap)
- **Not thread-safe**
- **Allows duplicates**
- **Null elements are not permitted**

---

## 🔧 Basic Syntax

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
```

---

## 📌 Example: Natural Ordering (Min-Heap)

```java
import java.util.PriorityQueue;

public class PriorityqueueInJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(2);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();

        }
    }
}
```

---

## 📘 Common Methods

| Method             | Description                                    |
| ------------------ | ---------------------------------------------- |
| `add(E e)`         | Inserts element, throws exception if fails     |
| `offer(E e)`       | Inserts element, returns false if fails        |
| `peek()`           | Retrieves, but does not remove, head           |
| `poll()`           | Retrieves and removes head                     |
| `remove(Object o)` | Removes a single instance of specified element |
| `size()`           | Returns the number of elements                 |
| `isEmpty()`        | Checks if the queue is empty                   |

---
