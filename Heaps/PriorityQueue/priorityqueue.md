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

## PriorityQueue (PQ) for objects

![objects](images/image1.png)

---

```java
package Heaps.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueObjects {
    static class Student implements Comparable<Student> { // overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

    }
}
```

---
