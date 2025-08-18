package BinaryTree.Questions;

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
