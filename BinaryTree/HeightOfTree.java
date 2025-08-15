package BinaryTree;

public class HeightOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

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

        int maxHeight = Math.max(lh, rh) + 1;

        return maxHeight;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
    }
}
