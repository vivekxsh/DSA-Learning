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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;

        // tail.next = newNode;
        // tail = newNode;
    }

    public void addMiddle(int data, int idx) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public void printList() {

        if (head == null) {
            System.out.println("Linkedlist is empty.");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getSize() {
        int size = 0;
        if (head == null) {
            System.out.println("Size is: 0");
            return;
        }

        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        System.out.println("Size is: " + size);
    }

    public static void main(String[] args) {

        linked_list ll = new linked_list();

        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(4);
        ll.addLast(4);

        ll.printList();

        ll.addMiddle(3, 2);
        ll.printList();

        ll.getSize();

        ll.removeFirst();
        ll.printList();

    }
}
