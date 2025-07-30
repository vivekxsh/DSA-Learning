### Questions

---

### `push` at the bottom of the stack

![push bottom](images/image.png)

---

![push bottom](images/image1.png)

---

```java
package stack.Questions;

import java.util.Stack;

public class PushAtTheBottom {

    static void pushAtBottom(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, value);

        stack.push(top);

    }

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        // initially push 10,11,12
        stack1.push(10);
        stack1.push(11);
        stack1.push(12);
        System.out.println("Stack: " + stack1);

        // push 20 at the bottom
        pushAtBottom(stack1, 20);

        System.out.println("Stack: " + stack1);

        while (!stack1.isEmpty()) {
            System.out.println(stack1.peek());
            stack1.pop();
        }

    }
}
```
