package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class binaryTreeLevelOrder {

    Node root;

    public void levelOrder(Node node) {

        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            }

            else {
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        binaryTreeLevelOrder level = new binaryTreeLevelOrder();

        level.root = new Node(1);
        level.root.left = new Node(2);
        level.root.right = new Node(3);
        level.root.left.left = new Node(4);
        level.root.left.right = new Node(5);
        level.root.right.right = new Node(6);

        System.out.println("level-order traversal: ");
        level.levelOrder(level.root);
        System.out.println();

    }
}
