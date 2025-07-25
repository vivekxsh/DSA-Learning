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

    public void removeFirst() {

        if (head == null) {
            System.out.println("Double LL is Empty.");
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
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

        DLL.removeFirst();
        DLL.printLL();
        System.out.println(size);

    }
}
