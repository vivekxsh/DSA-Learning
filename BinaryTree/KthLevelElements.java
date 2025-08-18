package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevelElements {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void levelOrder(Node node, int k) {

        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        int i = 1;

        while (!queue.isEmpty()) {

            Node current = queue.remove();
            i++;

            if (current == null) {

                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }

            }

            else {
                if (k == i) {
                    System.out.print(current.data + " ");

                }

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }

            }
        }
    }

    public static void printKthLevel(Node node, int k) {
        if (node == null) {
            return;
        }

        if (k == 1) {
            System.out.print(node.data + " ");
        }

        else {
            printKthLevel(node.left, k - 1);
            printKthLevel(node.right, k - 1);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // levelOrder(root, 3);
        printKthLevel(root, 2);

    }
}
