### **ArrayList Topic**

---

**_-> ArrayList is a linear data structure. It is dynamic in nature._**

![ArrayList](images/image.png)
![ArrayList](images/image1.png)

---

---

### 📌 Basic Operations & Their Time Complexities

| **Operation**                     | **Description**                     | **Time Complexity**   |
| --------------------------------- | ----------------------------------- | --------------------- |
| `add(E e)`                        | Adds element to the end             | **O(1)** (amortized)  |
| `add(int index, E element)`       | Inserts element at index            | **O(n)**              |
| `get(int index)`                  | Retrieves element at index          | **O(1)**              |
| `set(int index, E element)`       | Replaces element at index           | **O(1)**              |
| `remove(int index)`               | Removes element at index            | **O(n)**              |
| `remove(Object o)`                | Removes first occurrence of object  | **O(n)**              |
| `contains(Object o)`              | Checks if element exists            | **O(n)**              |
| `indexOf(Object o)`               | Returns index of first occurrence   | **O(n)**              |
| `lastIndexOf(Object o)`           | Returns index of last occurrence    | **O(n)**              |
| `size()`                          | Returns the number of elements      | **O(1)**              |
| `clear()`                         | Removes all elements                | **O(n)**              |
| `isEmpty()`                       | Checks if list is empty             | **O(1)**              |
| Iteration (e.g. for-each loop)    | Traverse the list                   | **O(n)**              |
| `toArray()`                       | Converts list to array              | **O(n)**              |
| `ensureCapacity(int minCapacity)` | Ensures capacity (can cause resize) | **O(n)** (worst case) |

---

### ⚙️ Explanation of Amortized `O(1)` for `add(E e)`

When adding an element at the **end**, if the internal array has room, it's **O(1)**. If the array is full, it resizes (typically doubles in size), which is an **O(n)** operation. However, this happens rarely, so the **amortized** time remains **O(1)**.

---

### 🚫 When to Avoid `ArrayList`

- **Frequent inserts/deletes in the middle** → use `LinkedList` instead.
- **Need for thread safety** → consider `Collections.synchronizedList()` or `CopyOnWriteArrayList`.

---

![operations](images/image2.png)
