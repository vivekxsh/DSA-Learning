### Time and Space complexity(TC)

---

![TC & SC](images/image.png)

### Time Complexity(TC) :

**_-> The amount of time taken by an algorithm/code based on input size is Time Complexity_**

---

### Space Complexity(SC) :

**_-> The amount of space taken by an algorithm/code based on input is Space Complexity_**

#### Time is directly proportional to number: $t \propto n$

![TC&SC](images/image1.png)

![TC&SC](images/image2.png)

---

**Big O notation(Upper bound)** is a mathematical concept used in computer science to describe the **performance or complexity** of an algorithm in terms of time or space as the input size grows.

---

### 🔹 **What Does Big O Measure?**

It primarily measures:

1. **Time Complexity** – how the runtime grows as input size increases.
2. **Space Complexity** – how the memory usage grows with input size.

---

### 🔹 **Why Use Big O?**

To understand:

- **Scalability** of algorithms.
- How they perform with **large inputs**.
- Which algorithms are **more efficient**.

---

### 🔹 **How It Works:**

Big O expresses the **upper bound** of an algorithm's growth rate.

For example:

- If an algorithm takes time proportional to `n`, we say it's **O(n)**.
- If it takes time proportional to `n²`, we say it's **O(n²)**.

---

### 🔹 **Common Big O Complexities (from best to worst):**

| Complexity | Name             | Example                                  |
| ---------- | ---------------- | ---------------------------------------- |
| O(1)       | Constant time    | Accessing an array element               |
| O(log n)   | Logarithmic time | Binary search                            |
| O(n)       | Linear time      | Loop through array                       |
| O(n log n) | Log-linear time  | Merge sort, quicksort (average)          |
| O(n²)      | Quadratic time   | Bubble sort, nested loops                |
| O(2ⁿ)      | Exponential time | Solving traveling salesman (brute force) |
| O(n!)      | Factorial time   | Solving all permutations                 |

---

### 🔹 **Key Points:**

- Big O ignores **constants and lower-order terms**.
  - `O(2n)` is still **O(n)**.
  - `O(n + log n)` is **O(n)**.
- It describes the **worst-case scenario** (usually).

---

![TC&SC](images/image3.png)

---

# Big Omega (Ω) Notation (Lower bound)

Big Omega (Ω) notation is used in algorithm analysis to describe the **best-case lower bound** of an algorithm's performance — that is, the **minimum amount of time (or space)** the algorithm will take for **any input of size _n_**.

---

### 🔹 What Big Omega Means:

If an algorithm is Ω(f(n)), it means:

> The algorithm takes **at least f(n)** time (or space) in the best case as _n_ grows.

So, while **Big O (O(f(n)))** tells us how bad things can get,  
**Big Omega (Ω(f(n)))** tells us how good things can get.

---

### 🔹 Comparison Table:

| Notation    | Meaning     | Describes...      |
| ----------- | ----------- | ----------------- |
| **O(f(n))** | Upper bound | Worst-case time   |
| **Ω(f(n))** | Lower bound | Best-case time    |
| **Θ(f(n))** | Tight bound | Both worst & best |

---

# Big Theta (Θ) Notation

Big Theta (Θ) notation describes the **tight bound** on an algorithm's running time — meaning it bounds the algorithm **both from above and below**. It gives a precise asymptotic behavior, showing that the algorithm takes **exactly f(n) time** (within constant factors) for large input size _n_.

---

### 🔹 What Big Theta Means:

If an algorithm is Θ(f(n)), it means:

> The algorithm's running time grows **asymptotically like f(n)** — neither faster nor slower.

So, Θ(f(n)) implies:

- The algorithm takes **at least c₁ \* f(n)** time (lower bound), and
- At most **c₂ \* f(n)** time (upper bound),

for some positive constants c₁ and c₂, when _n_ is sufficiently large.

---

### 🔹 Comparison Table:

| Notation    | Meaning     | Describes...      |
| ----------- | ----------- | ----------------- |
| **O(f(n))** | Upper bound | Worst-case time   |
| **Ω(f(n))** | Lower bound | Best-case time    |
| **Θ(f(n))** | Tight bound | Both worst & best |

---
