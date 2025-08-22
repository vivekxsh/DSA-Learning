// package BinarySearchTree_BST;

// public class BalancedBST {
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     static void preorder(Node node) {
//         if (node == null) {
//             return;
//         }

//         System.out.print(node.data + " ");
//         preorder(node.left);
//         preorder(node.right);
//     }

//     static Node createBST(int arr[], int si, int ei) {

//         if (si > ei) {
//             return null;
//         }
//         int mid = si + (ei - si) / 2;
//         Node root = new Node(arr[mid]);

//         root.left = createBST(arr, si, mid - 1);
//         root.right = createBST(arr, mid + 1, ei);

//         return root;
//     }

//     public static void main(String[] args) {

//         int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

//         Node root = createBST(arr, 0, arr.length - 1);

//         preorder(root);

//     }
// }

package BinarySearchTree_BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BalancedBST {

    public static Node createBST(int arr[], int si, int ei) {

        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, si, mid - 1);
        root.right = createBST(arr, mid + 1, ei);

        return root;
    }

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createBST(arr, 0, arr.length - 1);

        preorder(root);
    }

}