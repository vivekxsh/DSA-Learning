## DP (Dynamic Programming)

---

## 🔍 What is Dynamic Programming?

**Dynamic Programming (DP)** is a method used in algorithm design to solve problems by **breaking them down into simpler subproblems**, solving each subproblem **once**, and **storing their results** for future use. It is useful when a problem has:

- **Overlapping subproblems**
- **Optimal substructure**

---

## 🔄 When to Use DP

You use DP when:

1. **Subproblems repeat** — the problem can be broken into smaller pieces that recur.
2. **Storing previous results** avoids recomputation and saves time.

---

## 🧠 Key Concepts

### 1. **Memoization (Top-Down)**

- Solves the problem recursively.
- Stores results in a data structure (usually a dictionary or array) to avoid duplicate work.
- Example:

```java
import java.util.HashMap;

public class FibonacciMemo {

    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n <= 1) {
            return n;
        }

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10;  // Example: 10th Fibonacci number
        System.out.println("Fibonacci of " + n + " is " + fib(n));
    }
}

```

### 2. **Tabulation (Bottom-Up)**

- Solves the problem iteratively.
- Starts from the base cases and builds up.
- Example:

```java
public class FibonacciTab {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;  // Example: 10th Fibonacci number
        System.out.println("Fibonacci of " + n + " is " + fib(n));
    }
}
```

---

## 📦 Common DP Problems

| Problem Type | Examples                                                                   |
| ------------ | -------------------------------------------------------------------------- |
| Fibonacci    | `fib(n)`                                                                   |
| Knapsack     | `0/1 Knapsack`, `Unbounded Knapsack`                                       |
| Subsequence  | `Longest Common Subsequence (LCS)`, `Longest Increasing Subsequence (LIS)` |
| Partitioning | `Subset Sum`, `Equal Sum Partition`                                        |
| Matrix DP    | `Unique Paths`, `Minimum Path Sum`, `Edit Distance`                        |
| String DP    | `Palindrome Partitioning`, `Regular Expression Matching`                   |

---

## 🧭 How to Approach a DP Problem

1. **Identify if DP is needed**:

   - Are there overlapping subproblems?
   - Is there an optimal substructure?

2. **Define the state**:

   - What parameters define a subproblem? (e.g., `dp[i][j]`)

3. **Write the recurrence relation**:

   - How does a problem relate to its subproblems?

4. **Decide memoization or tabulation**.

5. **Implement base cases**.

6. **Build solution using your DP array or recursive function**.

---

## 📌 Summary

| Technique   | Approach                      | Time Saved               |
| ----------- | ----------------------------- | ------------------------ |
| Memoization | Top-down (recursion + cache)  | Avoids recomputation     |
| Tabulation  | Bottom-up (iterative + table) | Builds up from base case |

---

### Calulate fibonacci number

Great question!

---

The **Fibonacci sequence** is a series of numbers where:

> Each number is the **sum of the two preceding ones**.

The sequence starts with:

```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

---

### 🧠 Formula:

For a given position `n`, the Fibonacci number `F(n)` is:

```
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2)   for n ≥ 2
```

So:

- F(2) = 1 + 0 = 1
- F(3) = 1 + 1 = 2
- F(4) = 2 + 1 = 3
- F(5) = 3 + 2 = 5
- and so on...

> Solving fibonacci number by the help of Recursion

![fibonacci](images/image.png)

---

```java
// ******* Recursion based fibonacci code || Time complexity-> O(2^n) & Space
    // Complexity-> O(n) [due to stack calls]*********
public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

---

```markdown
| Complexity | Value                         |
| ---------- | ----------------------------- |
| Time       | O(2^n)                        |
| Space      | O(n) [Due to recursion stack] |
```

---

> Solving fibonacci number by the help of DP(Dynamic Programming) [Tabulation (Bottom-Up) Method]

![fib](images/image1.png)

---

### Fibonacci with Tabulation (Bottom-Up)

> Tabulation is a bottom-up dynamic programming approach. You solve smaller subproblems first and build up to the final solution.

---

```java
// ****** Calculate fibonacci by using DP (Tabulation method) || Time
    // complexity-> O(n) & Space complexity-> O(n) *******
public static int fibonacciDP(int n) {

    if (n <= 1) {
        return n;
    }

    int dp[] = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
```

---

```markdown
| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |
```

---

> Solving fibonacci number by the help of DP(Dynamic Programming) [Memoization (Top-Down) method]

### Fibonacci with Memoization (Top-Down)

> Memoization is a top-down dynamic programming approach. You solve the problem recursively, but you store (memoize) the results of subproblems so that you don’t compute them again.

---

```java
// ****** Calculate fibonacci by using dp (Memoization (Top-Down) method) ||
    // Time Complexity-> O(n) & Space complexity-> O(n) *******
public static int fibonacci(int n, int dp[]) {

    if (n <= 1) {
        return n;
    }

    if (dp[n] != 0) {
        return dp[n];
    }

    dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

    return dp[n];
}
```

---

```markdown
| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |
```

---

> Solving Recusion problem by the help of swapping

```java
// ******* Normal function by swapping the values || Time complexity-> O(n) &
    // Space complexity-> O(1) ***********
@SuppressWarnings("unused")
public static int fibonacciSwapping(int n) {
    if (n <= 1) {
        return n;
    }

    int fib = 0;
    int fib1 = 0, fib2 = 1;

    for (int i = 2; i <= n; i++) {
        fib = fib1 + fib2;

        int temp = fib1;
        fib1 = fib2;
        fib2 = fib;
    }

    return fib;
}
```

---

```markdown
| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |
```

---

### ** Important Questions on DP (Dynamic Programming) **

![important](images/image2.png)

---

![important](images/image3.png)

---
