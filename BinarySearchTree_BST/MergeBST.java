package BinarySearchTree_BST;

import java.util.ArrayList;
import java.util.Collections;

public class MergeBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
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

    static void inorder(Node node, ArrayList<Integer> nodes) {

        if (node == null) {
            return;
        }

        inorder(node.left, nodes);
        nodes.add(node.data);
        inorder(node.right, nodes);
    }

    static Node mergeBst(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(arr.get(mid));

        root.left = mergeBst(arr, si, mid - 1);
        root.right = mergeBst(arr, mid + 1, ei);

        return root;
    }

    public static void main(String[] args) {

        Node bst1 = new Node(2);
        bst1.left = new Node(1);
        bst1.right = new Node(4);

        Node bst2 = new Node(9);
        bst2.left = new Node(3);
        bst2.right = new Node(12);

        inorder(bst1);
        System.out.println();
        inorder(bst2);

        System.out.println();

        System.out.println("Mergining two bst's.");
        ArrayList<Integer> nodes = new ArrayList<>();

        inorder(bst1, nodes);
        inorder(bst2, nodes);

        Collections.sort(nodes);
        System.out.println(nodes);

        Node root = mergeBst(nodes, 0, nodes.size() - 1);

        preorder(root);

    }
}
