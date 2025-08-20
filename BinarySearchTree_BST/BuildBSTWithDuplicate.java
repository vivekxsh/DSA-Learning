package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Node2 {
    int data;
    int count;
    Node2 left;
    Node2 right;

    Node2(int data) {
        this.data = data;
        this.count = 1;
        this.left = this.right = null;
    }
}

public class BuildBSTWithDuplicate {

    // ********* Approach 1 **************
    // static Node insert(Node node, int data) {
    // if (node == null) {
    // return new Node(data);
    // }

    // if (node.data <= data) {
    // node.right = insert(node.right, data);
    // } else if (node.data > data) {
    // node.left = insert(node.left, data);
    // }

    // return node;
    // }

    // static void inorder(Node node) {
    // if (node == null) {
    // return;
    // }

    // inorder(node.left);
    // System.out.print(node.data + " ");
    // inorder(node.right);
    // }

    // ********* Approach 2 ***********
    static Node2 insertWithCount(Node2 node, int data) {
        if (node == null) {
            return new Node2(data);
        }

        if (node.data == data) {
            node.count++;
            return node;
        }

        if (node.data < data) {
            node.right = insertWithCount(node.right, data);
        } else {
            node.left = insertWithCount(node.left, data);
        }

        return node;
    }

    static void inOrder(Node2 node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " (" + node.count + ") " + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {

        int values[] = { 12, 10, 20, 9, 11, 10, 12, 12 };
        Node2 root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertWithCount(root, values[i]);
        }

        inOrder(root);
    }

}
