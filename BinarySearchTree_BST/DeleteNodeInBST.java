package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class DeleteNodeInBST {

    static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (node.data > data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    static void inOrder(Node node) {

        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static Node deleteNode(Node node, int data) {
        if (node.data > data) {
            node.left = deleteNode(node.left, data);
        } else if (node.data < data) {
            node.right = deleteNode(node.right, data);
        } else {
            // case 1: leaf node
            if (node.left == null && node.right == null) {
                return null;
            }

            // case 2: Single child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // case 3 : Both child
            Node IS = findInorderSuccessor(node.right);
            node.data = IS.data;
            node.right = deleteNode(node.right, IS.data);

        }

        return node;
    }

    static Node findInorderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        deleteNode(root, 14);
        System.out.println();

        inOrder(root);

    }

}
