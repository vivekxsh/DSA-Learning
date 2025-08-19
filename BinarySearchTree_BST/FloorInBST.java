package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class FloorInBST {

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
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static int floorValue(Node node, int x) {
        if (node == null) {
            return -1;
        }

        if (node.data == x) {
            return node.data;
        }

        if (node.data > x) {
            return floorValue(node.left, x);
        }

        int floorValue = floorValue(node.right, x);

        return (floorValue <= x && floorValue != -1) ? floorValue : node.data;
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

        System.out.println();
        System.out.println("Floor value: " + floorValue(root, 70));

    }

}
