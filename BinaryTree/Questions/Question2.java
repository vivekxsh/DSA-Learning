package BinaryTree.Questions;

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