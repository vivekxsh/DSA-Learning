### Stack Data Structure

> In Java, a **Stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle — the last element added to the stack is the first one to be removed.

---

### 🧠 Stack Class Methods

| Method             | Description                               |
| ------------------ | ----------------------------------------- |
| `push(E item)`     | Pushes an item onto the top of the stack  |
| `pop()`            | Removes and returns the top item          |
| `peek()`           | Returns the top item without removing it  |
| `isEmpty()`        | Checks if the stack is empty              |
| `search(Object o)` | Returns position from top (1-based index) |

---

### Creating Stack using ArrayList

---

### ✅ Stack Operations

A stack typically supports the following operations:

1. **Push** – Add an element to the top of the stack.
2. **Pop** – Remove and return the top element.
3. **Peek** – Return the top element without removing it.
4. **isEmpty** – Check if the stack is empty.
5. **Size** – Return the number of elements in the stack.

---

```java
package stack;

import java.util.ArrayList;

public class StackUsingAL {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        /*
         * stack operations:-
         * isEmpty();
         * push();
         * pop();
         * peek();
         */

        // isEmpty
        boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }

        public int size() {
            return list.size();
        }

    }

    // @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {

            System.out.println(s.peek());

            s.pop();

        }

    }

}
```

---

### Creating Stack using LinkedList

```java
package stack;

public class StackUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        static Node head = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
```

---

### Stack implementation from Java Collection framework

```java
package stack;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
```
