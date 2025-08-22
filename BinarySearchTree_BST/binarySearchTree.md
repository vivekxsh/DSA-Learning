### **Binary Search Tree (BST)**

![tree](images/image.png)

---

## What is a **Binary Search Tree (BST)?**

A **BST** is a special kind of **binary tree** with the following properties:

1. **Each node has at most two children** — commonly called left and right child.
2. For every node:

   - All nodes in the **left subtree** have values **less than** the node’s value.
   - All nodes in the **right subtree** have values **greater than** the node’s value.

3. There are **no duplicate values** (usually).

---

> Build BST

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BuildBST {

    static Node build(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = build(node.left, data);
        } else {
            node.right = build(node.right, data);
        }

        return node;
    }

    public static void main(String[] args) {
        Node root = null;

        root = build(root, 50);
        root = build(root, 30);
        root = build(root, 20);
        root = build(root, 40);
        root = build(root, 70);
        root = build(root, 60);
        root = build(root, 80);
    }

}
```

---

> Build BST With Duplicate data

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Node2 {
    int data;
    int count;
    Node2 left;
    Node2 right;

    Node2(int data) {
        this.data = data;
        this.count = 1;
        this.left = this.right = null;
    }
}

public class BuildBSTWithDuplicate {

    // ********* Approach 1 **************
    // static Node insert(Node node, int data) {
    // if (node == null) {
    // return new Node(data);
    // }

    // if (node.data <= data) {
    // node.right = insert(node.right, data);
    // } else if (node.data > data) {
    // node.left = insert(node.left, data);
    // }

    // return node;
    // }

    // static void inorder(Node node) {
    // if (node == null) {
    // return;
    // }

    // inorder(node.left);
    // System.out.print(node.data + " ");
    // inorder(node.right);
    // }

    // ********* Approach 2 ***********
    static Node2 insertWithCount(Node2 node, int data) {
        if (node == null) {
            return new Node2(data);
        }

        if (node.data == data) {
            node.count++;
            return node;
        }

        if (node.data < data) {
            node.right = insertWithCount(node.right, data);
        } else {
            node.left = insertWithCount(node.left, data);
        }

        return node;
    }

    static void inOrder(Node2 node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " (" + node.count + ") " + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {

        int values[] = { 12, 10, 20, 9, 11, 10, 12, 12 };
        Node2 root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertWithCount(root, values[i]);
        }

        inOrder(root);
    }

}
```

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
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
```

---

## Insert operation example:

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class InsertionInBST {

    static Node insert(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }

        // do not allow duplicate values
        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public static void main(String args[]) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);

    }
}

```

### Dletion in BST

**Case 1. Delete a Leaf Node in BST**

![case 1](images/image2.png)

---

**Case 2. Delete a Node with Single Child in BST**

> Deleting a single child node is also simple in BST. Copy the child to the node and delete the node.

![case 2](images/image3.png)

---

**Case 3. Delete a Node with Both Children in BST**

> Deleting a node with both children is not so simple. Here we have to delete the node is such a way, that the resulting tree follows the properties of a BST.

> The trick is to find the inorder successor of the node. Copy contents of the inorder successor to the node, and delete the inorder successor.

![case 3](images/image4.png)

---

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class DeleteNodeInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (node.data > data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {

        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static Node deleteNode(Node node, int data) {
        if (node.data > data) {
            node.left = deleteNode(node.left, data);
        } else if (node.data < data) {
            node.right = deleteNode(node.right, data);
        } else {
            // case 1: leaf node
            if (node.left == null && node.right == null) {
                return null;
            }

            // case 2: Single child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // case 3 : Both child
            Node IS = findInorderSuccessor(node.right);
            node.data = IS.data;
            node.right = deleteNode(node.right, IS.data);

        }

        return node;
    }

    static Node findInorderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        deleteNode(root, 14);
        System.out.println();

        inOrder(root);

    }

}
```

---

## Summary

- BSTs efficiently **store, search, and manage** sorted data.
- Structure is based on the **ordering property**: left < node < right.
- Traversing BST inorder produces sorted data.

---

### Concept of Search in BST

![search](images/image1.png)

---

The **concept of search in a Binary Search Tree (BST)** in Java is based on the **properties of BST**:

- The left subtree of a node contains only nodes with keys **less than** the node’s key.
- The right subtree contains only nodes with keys **greater than** the node’s key.
- Both left and right subtrees must also be BSTs.

### 🔍 Concept of Searching in BST:

To **search for a value `key`** in a BST:

1. Start from the root node.
2. Compare the key with the current node's data:

   - If `key == node.data`: return the node (key found).
   - If `key < node.data`: recursively search the **left subtree**.
   - If `key > node.data`: recursively search the **right subtree**.

3. If you reach a null node, the key is **not present** in the tree.

---

### ✅ Java Implementation of Search in BST

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SearchingInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static boolean search(Node node, int key) {

        if (node != null) {
            if (node.data == key) {
                return true;
            }

            if (key < node.data) {
                return search(node.left, key);
            } else {
                return search(node.right, key);
            }
        }

        return false;

    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);

        System.out.println("Searching in BST.");
        if (search(root, 20)) {
            System.out.println("Key is found.");
        } else {
            System.out.println("Key is not found.");
        }
    }
}

```

---

### 🔁 Time Complexity:

- **Average case**: O(log n) -> O(H) [H -> Height of the tree]
- **Worst case**: O(n) — happens when the tree becomes skewed (like a linked list)

---

### Find minimum in BST

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class MinimumInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (node.data > data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static int findMinimum(Node node) {
        if (node == null) {
            return -1;
        }

        Node curr = node;

        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.data;
    }

    public static void main(String args[]) {

        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);
        System.out.println();
        System.out.println(findMinimum(root));
    }

}
```

---

### Find Maximum in BST

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class MaximumInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        }

        else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static int findMaximum(Node node) {

        if (node == null) {
            return -1;
        }

        Node current = node;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);

        System.out.println();
        System.out.println("Maximum Element in tree is : " + findMaximum(root));
    }

}
```

---

### Floor in Binary Search Tree(BST)

> Given a Binary Search Tree and a number x, the task is to find the floor of x in the given BST, where floor means the greatest value node of the BST which is smaller than or equal to x. if x is smaller than the smallest node of BST then return -1.

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class FloorInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static int floorValue(Node node, int x) {
        if (node == null) {
            return -1;
        }

        if (node.data == x) {
            return node.data;
        }

        if (node.data > x) {
            return floorValue(node.left, x);
        }

        int floorValue = floorValue(node.right, x);

        return (floorValue <= x && floorValue != -1) ? floorValue : node.data;
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);

        System.out.println();
        System.out.println("Floor value: " + floorValue(root, 70));

    }

}
```

---

### Print the values in the range

![print in range](images/image5.png)

---

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintInRange {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (node.data < data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    static void printInRange(Node node, int k1, int k2) {

        if (node == null) {
            return;
        }

        printInRange(node.left, k1, k2);
        if (node.data >= k1 && node.data <= k2) {
            System.out.print(node.data + " ");
        }
        printInRange(node.right, k1, k2);
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // print in range
        int k1 = 5, k2 = 12;
        System.out.println("Printing in range between " + k1 + " " + k2);
        printInRange(root, k1, k2);
    }

}
```

---

### Print Elements from root to leaf

![root to leaf](images/image6.png)

---

```java

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintRoot2Leaf {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);

        }

        if (node.data == data) {
            return node;
        }

        if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    static void printRootToLeaf(Node node, ArrayList<Integer> path) {

        if (node == null) {
            return;
        }

        path.add(node.data);

        if (node.left == null && node.right == null) {
            printPath(path);
        }

        printRootToLeaf(node.left, path);
        printRootToLeaf(node.right, path);

        path.remove(path.size() - 1);
    }

    static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();
        printRootToLeaf(root, new ArrayList<>());

    }
}
```

---

### Validate Binary Search Tree

**Validating a Binary Search Tree (BST) means checking if the tree satisfies the BST property:**

```
For every node:
> All values in its left subtree are less than the node's value.
> All values in its right subtree are greater than the node's value.

```

---

![valid bst](images/image7.png)

---

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class ValidBST {

    static Node insert(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }
        if (node.data == data) {
            return node;
        }

        if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);

    }

    static boolean validateBST(Node node) {

        return validateBST(node, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    static boolean validateBST(Node node, long min, long max) {

        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data >= max) {
            return false;
        }

        return validateBST(node.left, min, node.data) && validateBST(node.right, node.data, max);
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();

        if (validateBST(root)) {
            System.out.println("Bianry search tree is valid.");
        } else {
            System.out.println("Binary search tree is not valid.");
        }

    }
}
```

---

### Mirror a Binary Search Tree

![mirror](images/image8.png)

---

```java

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class MirrorBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    // function to mirror tree
    static void mirror(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);

    }

    static void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String args[]) {

        int values[] = { 8, 5, 10, 3, 6, 11 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        preorder(root);
        System.out.println();
        System.out.println("After Mirroring the tree.");
        mirror(root);
        preorder(root);

    }
}
```

---

### Balanced BST from a sorted array

![balanced](images/image9.png)

---

![balanced](images/image10.png)

---

1. Pick the middle element of the array as the root.
2. Recursively do the same for the left half to create the left subtree.
3. Recursively do the same for the right half to create the right subtree.

This guarantees a balanced BST.

---

### Code example:

```java

// public class BalancedBST {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     static void preorder(Node node) {
//         if (node == null) {
//             return;
//         }

//         System.out.print(node.data + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }

//     static Node createBST(int arr[], int si, int ei) {

//         if (si > ei) {
//             return null;
//         }
//         int mid = si + (ei - si) / 2;
//         Node root = new Node(arr[mid]);

//         root.left = createBST(arr, si, mid - 1);
//         root.right = createBST(arr, mid + 1, ei);

//         return root;
//     }

//     public static void main(String[] args) {

//         int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

//         Node root = createBST(arr, 0, arr.length - 1);

//         preorder(root);

//     }
// }

// ******** Second way ************

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BalancedBST {

    public static Node createBST(int arr[], int si, int ei) {

        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, si, mid - 1);
        root.right = createBST(arr, mid + 1, ei);

        return root;
    }

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createBST(arr, 0, arr.length - 1);

        preorder(root);
    }

}
```

---

### **convert an unbalanced BST into a balanced BST**.

![bst -> balance bst](images/image11.png)

---

### The general approach:

1. **Inorder traversal** of the BST to get elements in sorted order.
2. Use the sorted list to **build a balanced BST** (like we did before from a sorted array).

---

### Here’s how you can do it in Java:

```java

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class ConvertBSTToBalancedBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    static void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node, ArrayList<Integer> nodes) {
        if (node == null) {
            return;
        }

        inorder(node.left, nodes);
        nodes.add(node.data);
        inorder(node.right, nodes);
    }

    static Node balanceBST(ArrayList<Integer> nodes, int si, int ei) {

        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(nodes.get(mid));

        root.left = balanceBST(nodes, si, mid - 1);
        root.right = balanceBST(nodes, mid + 1, ei);

        return root;
    }

    public static void main(String[] args) {

        // int values[] = {8,6,10,5,11,3,12};

        // unbalanced tree
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Inorder traversal of the unbalanced tree.");
        preorder(root);
        System.out.println();

        // convert it into balance tree
        ArrayList<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);

        // balance function
        balanceBST(nodes, 0, nodes.size() - 1);

        System.out.println("Inorder traversal after balancing the tree.");
        preorder(root);

    }

}

```

---

### Explanation:

- **`inorderTraversal`** collects nodes in sorted order.
- **`sortedListToBST`** rebuilds a balanced BST from the sorted list.
- **`balanceBST`** is the main method combining these steps.

---
