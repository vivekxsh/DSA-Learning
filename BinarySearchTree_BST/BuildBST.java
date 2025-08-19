package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BuildBST {

    static Node build(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data == data) {
            return node;
        }

        if (data < node.data) {
            node.left = build(node.left, data);
        } else {
            node.right = build(node.right, data);
        }

        return node;
    }

    public static void main(String[] args) {
        Node root = null;

        root = build(root, 50);
        root = build(root, 30);
        root = build(root, 20);
        root = build(root, 40);
        root = build(root, 70);
        root = build(root, 60);
        root = build(root, 80);
    }

}
