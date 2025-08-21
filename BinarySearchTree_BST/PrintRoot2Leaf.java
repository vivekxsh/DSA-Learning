package BinarySearchTree_BST;

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
