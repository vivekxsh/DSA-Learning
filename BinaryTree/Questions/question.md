### Binary Tree Practice Question

### **Question 1** : _Check Whether the tree is univalued or not_

### ✅ What Does **Univalued Binary Tree** Mean?

A **univalued binary tree** is a tree where **every node has the same value**.

---

### 📌 Definition:

> A binary tree is **univalued** if **all nodes** in the tree have the **same integer value**.

---

### 🔍 Example of a Univalued Tree:

```
      1
     / \
    1   1
   / \
  1   1
```

✅ All nodes have the value `1` → this **is** a **univalued** tree.

---

### ❌ Example of a Non-Univalued Tree:

```
      1
     / \
    1   2
```

❌ One of the nodes has a different value (`2`) → this **is not** a univalued tree.

---

```java

import java.util.HashSet;

public class Question1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void univalued(Node node, HashSet<Integer> set) {

        if (node == null) {
            return;
        }

        set.add(node.data);
        univalued(node.left, set);
        univalued(node.right, set);

    }

    static boolean checkUnivalued(Node node, int data) {
        if (node == null) {
            return true;
        }

        if (node.data != data) {
            return false;
        }

        return checkUnivalued(node.left, data) && checkUnivalued(node.right, data);

    }

    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);

        HashSet<Integer> set = new HashSet<>();
        univalued(root, set);

        System.out.println((set.size() == 1) ? "Univalued" : "Not Univalued");

        System.out.println(checkUnivalued(root, root.data));

    }
}
```

---

### Check whether the tree is inverted or not

```java

import java.util.ArrayList;

public class Question2 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static void traverse(Node node, ArrayList<Integer> arr) {
        if (node == null) {
            return;
        }

        arr.add(node.data);
        traverse(node.left, arr);
        traverse(node.right, arr);

    }

    static void traverse2(Node node, ArrayList<Integer> arr2) {

        if (node == null) {
            return;
        }

        arr2.add(node.data);
        traverse2(node.right, arr2);
        traverse2(node.left, arr2);
    }

    public static void main(String[] args) {

        // first tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // second tree
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.left.left = new Node(7);
        root2.left.right = new Node(6);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        traverse(root, arr);
        traverse2(root2, arr2);

        if (arr.size() != arr2.size()) {
            System.out.println("Not a Invert Binary tree. (Not Mirror)");
            return;
        }

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) != arr2.get(i)) {
                System.out.println("Not a Invert Binary tree. (Not Mirror)");
                return;
            }

        }

        System.out.println("Is a Invert Binary tree. (Mirror)");

    }
}
```

---

### To invert the tree intentially

```java
void invert(Node node){

    if(node == null){
        return;
    }

    Node temp = node.left;
    node.left = node.right;
    node.right = temp;

    invert(node.left);
    invert(node.right);
}
```

---

`or else`

```java
Node invert(Node node){

    if(node == null){
        return node;
    }

    Node temp = node.left;
    node.left = node.right;
    node.right = temp;

    invert(node.left);
    invert(node.right);

    return node;
}
```
