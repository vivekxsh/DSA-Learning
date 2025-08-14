package BinaryTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class binaryTreePostorder {

    Node root;

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        binaryTreePostorder postorder = new binaryTreePostorder();

        postorder.root = new Node(1);
        postorder.root.left = new Node(2);
        postorder.root.right = new Node(3);
        postorder.root.left.left = new Node(4);
        postorder.root.left.right = new Node(5);
        postorder.root.right.right = new Node(6);

        System.out.print("Post-order Traversal: ");
        postorder.postOrder(postorder.root);
        System.out.println();

    }
}
