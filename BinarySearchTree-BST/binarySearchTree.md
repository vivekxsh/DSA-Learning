### **Binary Search Tree (BST)**

---

## What is a **Binary Search Tree (BST)?**

A **BST** is a special kind of **binary tree** with the following properties:

1. **Each node has at most two children** — commonly called left and right child.
2. For every node:

   - All nodes in the **left subtree** have values **less than** the node’s value.
   - All nodes in the **right subtree** have values **greater than** the node’s value.

3. There are **no duplicate values** (usually).

---

## Why use a BST?

- **Fast searching:** Average-case search time is **O(log n)**.
- **Fast insertion and deletion** operations (on average).
- Maintains elements in **sorted order**.
- Useful for dynamic datasets where data is frequently inserted or removed.

---

## Basic operations on a BST

| Operation     | Description                                | Average Time Complexity |
| ------------- | ------------------------------------------ | ----------------------- |
| **Search**    | Find if a value exists in the tree         | O(log n)                |
| **Insert**    | Add a new value preserving BST property    | O(log n)                |
| **Delete**    | Remove a value while maintaining structure | O(log n)                |
| **Traversal** | Inorder traversal returns sorted order     | O(n)                    |

---

## Example BST:

```
        8
       / \
      3   10
     / \    \
    1   6    14
       / \   /
      4   7 13
```

- Left subtree of `8` has all values < 8.
- Right subtree of `8` has all values > 8.
- This property holds recursively for every node.

---

## Sample Java class for BST Node:

```java
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
```

---

## Insert operation example:

```java
TreeNode insert(TreeNode root, int val) {
    if (root == null) return new TreeNode(val);

    if (val < root.val)
        root.left = insert(root.left, val);
    else if (val > root.val)
        root.right = insert(root.right, val);

    return root;
}
```

---

## Summary

- BSTs efficiently **store, search, and manage** sorted data.
- Structure is based on the **ordering property**: left < node < right.
- Traversing BST inorder produces sorted data.

---
