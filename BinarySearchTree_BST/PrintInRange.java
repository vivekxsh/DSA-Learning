package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintInRange {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (node.data < data) {
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

    static void printInRange(Node node, int k1, int k2) {

        if (node == null) {
            return;
        }

        printInRange(node.left, k1, k2);
        if (node.data >= k1 && node.data <= k2) {
            System.out.print(node.data + " ");
        }
        printInRange(node.right, k1, k2);
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // print in range
        int k1 = 5, k2 = 12;
        System.out.println("Printing in range between " + k1 + " " + k2);
        printInRange(root, k1, k2);
    }

}
