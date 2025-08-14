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

public class Tree {

    Node root;

    // in-order traversal
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // pre-order traversal
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);

    }

    // post-order traversal
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // level-order traversal
    public void levelOrder(Node node) {

        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {

            Node current = queue.remove();

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

    public static void main(String args[]) {

        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // inorder
        System.out.println("Inorder Traversal.");
        tree.inOrder(tree.root);
        System.out.println();

        // preorder
        System.out.println("PreOrder Traversal.");
        tree.preOrder(tree.root);
        System.out.println();

        // postOrder
        System.out.println("PostOrder Traversal.");
        tree.postOrder(tree.root);
        System.out.println();

        // level order
        System.out.println("Level-Order Traversal.");
        tree.levelOrder(tree.root);
        System.out.println();

    }
}
