### BackTracking

---

**Backtracking** is a general algorithmic technique for solving problems incrementally by trying partial solutions and then abandoning ("backtracking") them if they do not lead to a complete solution. It is often used for solving **constraint satisfaction problems**, **combinatorial problems**, and **puzzle solving**.

---

### 🔍 **Core Concept of Backtracking**

Backtracking is essentially a **depth-first search (DFS)** of all possible configurations of a solution. At each step, you:

1. Choose an option.
2. Proceed recursively.
3. If a solution is invalid or complete, backtrack by undoing the last choice and trying the next option.

---

### 🧱 **Key Elements of Backtracking**

1. **Decision Space**: All possible choices at each step.
2. **Constraints**: Conditions that must be satisfied.
3. **Goal/Objective**: A valid and possibly optimal solution.
4. **Backtrack Condition**: When a partial solution violates constraints or cannot lead to a valid solution.

---

### 📚 **Common Problems Solved Using Backtracking**

| Problem Type            | Example                             |
| ----------------------- | ----------------------------------- |
| Combinatorial           | Permutations, combinations, subsets |
| Puzzle Solving          | Sudoku, N-Queens, Crossword         |
| Constraint Satisfaction | Map coloring, Scheduling            |
| Path Finding            | Maze solving, Knight’s Tour         |
| Game Theory             | Minimax in game trees               |

---

### 🔄 **Difference Between Backtracking and Other Techniques**

| Technique               | Description                                                  |
| ----------------------- | ------------------------------------------------------------ |
| **Brute Force**         | Tries all possibilities without pruning                      |
| **Backtracking**        | Tries possibilities with early pruning                       |
| **Dynamic Programming** | Solves subproblems and stores results to avoid recomputation |
| **Greedy**              | Makes local optimal choices, no backtracking                 |

---

### 🧠 **Optimizations Used with Backtracking**

- **Pruning**: Skip paths that cannot possibly lead to a solution.
- **Heuristics**: Choose the most promising candidates first.
- **Memoization**: Avoid re-solving the same subproblem.

---

![backtrack](images/image.png)

---

### **Types of Backtrack**

- **Decision**: Check whether the solution exists or not
- **Optimization**: Choose best solutions among all the solutions
- **Enumeration**: List all the possible solutions for the particular question

---

![types of backtrack](images/image1.png)
