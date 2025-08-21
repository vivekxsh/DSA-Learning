package BinarySearchTree_BST;

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
