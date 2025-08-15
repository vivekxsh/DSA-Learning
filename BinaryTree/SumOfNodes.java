package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SumOfNodes {

    Node root;

    public int levelOrderSum(Node node) {

        if (node == null) {
            return 0;
        }

        int sum = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            sum += current.data;

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

        }

        return sum;
    }

    // calculate sum recursively
    int calculateSumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }

        return node.data + calculateSumOfNodes(node.left) + calculateSumOfNodes(node.right);
    }

    public static void main(String[] args) {

        SumOfNodes sum = new SumOfNodes();
        sum.root = new Node(1);
        sum.root.left = new Node(2);
        sum.root.right = new Node(3);
        sum.root.left.left = new Node(4);
        sum.root.left.right = new Node(5);
        sum.root.right.right = new Node(6);

        System.out.println(sum.levelOrderSum(sum.root));

        System.out.println(sum.calculateSumOfNodes(sum.root));

    }
}
