package BinaryTree;

public class SubTreeOfTree {

    // Main Tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // subtree
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (isSame(root, subRoot)) {
            return true;
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static boolean isSame(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data != subRoot.data) {
            return false;
        }

        return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }

    public static void main(String[] args) {

        // main tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // suntree
        Node subtree = new Node(2);
        subtree.left = new Node(4);
        subtree.right = new Node(5);

        System.out.println(isSubTree(root, subtree));

    }
}
