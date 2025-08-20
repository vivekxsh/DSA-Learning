package BinarySearchTree_BST;

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

        // root = insert(root, 50);
        // root = insert(root, 30);
        // root = insert(root, 20);
        // root = insert(root, 40);
        // root = insert(root, 70);
        // root = insert(root, 60);
        // root = insert(root, 80);

        int values[] = { 50, 30, 20, 40, 70, 60, 80 };
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        System.out.println();
        System.out.println("Maximum Element in tree is : " + findMaximum(root));
    }

}
