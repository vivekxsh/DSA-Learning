### Queue Questions

---

> Question 1 -> Generate binary numbers

> Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N

```java

import java.util.Queue;
import java.util.LinkedList;

public class Question1 {

    public static String binaryString(int num) {
        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int digit = num % 2;
            binary.append(digit);
            num = num / 2;
        }

        return binary.reverse().toString();
    }

    public static void generateBinaryNumber(int n) {

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String binary = queue.remove();
            System.out.println(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");

        }

    }

    public static void main(String[] args) {
        int n = 10;

        generateBinaryNumber(n);

        // for (int i = 1; i <= n; i++) {
        // System.out.println(binaryString(i));
        // }

    }
}
```

**_🪝Output: _**

```
Sample Input 1: N =2
Sample Output 1: 1 10
Sample Input 2: 5.
Sample Output 2: 1 10 11 100 101
```

---

**_Question 4 : Reversing the first K elements of a Queue_**

> We have an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.
> Sample Input 1:Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
> Sample Output 1: Q = [50, 40, 30, 20, 10, 60, 70,80, 90, 100]

```java

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

public class Question4 {
    public static void reverseQueue(Queue<Integer> q, int k) {

        int size = q.size();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the queue: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into queue.");
        Queue<Integer> q = new LinkedList<>();

        while (n-- > 0) {
            q.add(sc.nextInt());
        }

        System.out.print("Enter the k value upto it has to reverse: ");
        int k = sc.nextInt();

        reverseQueue(q, k);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        sc.close();

    }
}
```

**_🪝Output: _**

```
Enter the length of the queue: 10
Enter elements into queue.
10 20 30 40 50 60 70 80 90 100
Enter the k value upto it has to reverse: 5
50 40 30 20 10 60 70 80 90 100
```

---

**_Question 5 : Maximum of all subarrays of size k_**

> We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

> Sample Input 1:N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
> Sample Output 1: 3 3 4 5 5 5 6

```java

import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < k + i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            ans.add(max);
        }

        System.out.println(ans);

    }
}
```
