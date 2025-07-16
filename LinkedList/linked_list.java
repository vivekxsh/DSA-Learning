package LinkedList;

public class linked_list {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) { // constant time O(1)
        // Step 1 -> Create new node
        Node newNode = new Node(data);

        // if head is null
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 -> assign head to newNode
        newNode.next = head;

        // step 3 -> update head
        head = newNode;

    }

    public static void main(String[] args) {

        linked_list ll = new linked_list();

        ll.addFirst(1);
        ll.addFirst(2);

    }
}
