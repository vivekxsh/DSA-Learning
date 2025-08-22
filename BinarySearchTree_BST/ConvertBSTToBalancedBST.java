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

public class ConvertBSTToBalancedBST {

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

    static Node balanceBST(ArrayList<Integer> nodes, int si, int ei) {

        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(nodes.get(mid));

        root.left = balanceBST(nodes, si, mid - 1);
        root.right = balanceBST(nodes, mid + 1, ei);

        return root;
    }

    public static void main(String[] args) {

        // int values[] = {8,6,10,5,11,3,12};

        // unbalanced tree
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Inorder traversal of the unbalanced tree.");
        preorder(root);
        System.out.println();

        // convert it into balance tree
        ArrayList<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);

        // balance function
        balanceBST(nodes, 0, nodes.size() - 1);

        System.out.println("Inorder traversal after balancing the tree.");
        preorder(root);

    }

}
