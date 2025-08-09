### Question 1 : K’th largest element in a stream

---

## We have an infinite stream of integers, find the k’th largest element at any point of time.

---

> Input : stream[] = {10, 20, 11, 70, 50, 40, 100, 5, ...} k = 3
> Output : {_, _, 10, 11, 20, 40, 50, 50, ...}

---

```java
package Heaps.PriorityQueue.Questions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Question1 {

    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);

            while (pq.size() > k) {
                pq.remove();
            }
        }

        return pq.remove();
    }

    public static void main(String[] args) {

        // int arr[] = { 10, 20, 11, 70, 50, 40, 100, 5 };
        // int k = 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements into arrat.");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the kth value: ");
        int k = sc.nextInt();

        System.out.println(kthLargest(arr, k));

    }
}

```
