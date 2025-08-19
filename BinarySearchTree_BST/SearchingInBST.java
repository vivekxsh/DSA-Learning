package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SearchingInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    static boolean search(Node node, int key) {

        if (node != null) {
            if (node.data == key) {
                return true;
            }

            if (key < node.data) {
                return search(node.left, key);
            } else {
                return search(node.right, key);
            }
        }

        return false;

    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        inOrder(root);

        System.out.println("Searching in BST.");
        if (search(root, 20)) {
            System.out.println("Key is found.");
        } else {
            System.out.println("Key is not found.");
        }
    }
}
