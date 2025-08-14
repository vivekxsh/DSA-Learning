package BinaryTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class binaryTreePreOrder {

    Node root;

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {

        binaryTreePreOrder preOrder = new binaryTreePreOrder();

        preOrder.root = new Node(1);
        preOrder.root.left = new Node(2);
        preOrder.root.right = new Node(3);
        preOrder.root.left.left = new Node(4);
        preOrder.root.left.right = new Node(5);
        preOrder.root.right.right = new Node(6);

        System.out.print("Pre-order Traversal: ");
        preOrder.preOrder(preOrder.root);
        System.out.println();

    }
}
