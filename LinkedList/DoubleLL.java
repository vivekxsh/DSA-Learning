package LinkedList;

public class DoubleLL {

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    // remove

    public int removeFirst() {

        if (head == null) {
            System.out.println("Double LL is Empty.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    // print DLL
    public void printLL() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoubleLL DLL = new DoubleLL();

        DLL.addFirst(4);
        DLL.addFirst(3);
        DLL.addFirst(2);
        DLL.addFirst(1);

        DLL.printLL();

        System.out.println(size);

        System.out.println(DLL.removeFirst());
        DLL.printLL();
        System.out.println(size);

    }
}
