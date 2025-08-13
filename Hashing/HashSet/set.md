### HashSet

![set](images/image.png)

### What is a HashSet?

- **HashSet** is a part of Java’s **Collection Framework**.
- It implements the **Set** interface.
- It stores **unique elements** (no duplicates allowed).
- It is **unordered**, meaning it does not guarantee any specific order of elements.
- It uses a **hash table** internally for storage, which allows **constant-time performance** for basic operations like add, remove, contains, etc.

---

### Key Characteristics

| Feature       | Description                                                      |
| ------------- | ---------------------------------------------------------------- |
| Duplicates    | Not allowed (only one copy of each element)                      |
| Order         | No guaranteed order                                              |
| Null elements | Allows one null element                                          |
| Thread safety | Not synchronized (use `Collections.synchronizedSet()` if needed) |
| Performance   | Fast operations due to hashing                                   |

---

### Basic Usage Example

```java

import java.util.HashSet;

public class set {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        if (set.contains("Banana")) {
            System.out.println("Banana is present.");
        }

        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println(set);
    }
}

```

---

### Common Methods

| Method               | Description                   |
| -------------------- | ----------------------------- |
| `add(E e)`           | Adds the specified element    |
| `remove(Object o)`   | Removes the specified element |
| `contains(Object o)` | Checks if element is present  |
| `size()`             | Returns number of elements    |
| `isEmpty()`          | Checks if set is empty        |
| `clear()`            | Removes all elements          |

---

### Iteration on HashSet

![iteration](images/image1.png)

---

```java

import java.util.HashSet;
import java.util.Iterator;

public class IterationUsingIterator {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");

        // iteration by using iterator
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // advanced for loop
        for (String item : set) {
            System.out.println(item);
        }
    }
}
```
