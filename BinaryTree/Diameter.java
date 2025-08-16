package BinaryTree;

public class Diameter {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
    }

    public static int diam2(Node node) {
        if (node == null) {
            return 0;
        }

        int lDiam = diam2(node.left);
        int rDiam = diam2(node.right);

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh + rh + 1, Math.max(lDiam, rDiam));
    }

    // Approach 2

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diam(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }

        Info ldiam = diam(root.left);
        Info rdiam = diam(root.right);

        int diameter = Math.max(Math.max(ldiam.diam, rdiam.diam), ldiam.ht + rdiam.ht + 1);
        int ht = Math.max(ldiam.ht, rdiam.ht) + 1;

        return new Info(diameter, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diam2(root));

        System.out.println(diam(root).diam);
    }
}
