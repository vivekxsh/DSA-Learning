package LinkedList;

import java.util.ArrayList;

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

        if (head == null) {
            System.out.println("Linkedlist is empty.");
            return Integer.MIN_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
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

    // search key iteratively
    public int iterativeSearch(int key) {

        if (head == null) {
            return -1;
        }
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }

        return -1;
    }

    // search key recursively

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // remove last element from a linkedlist
    public int removeLast() {

        if (head == null) {
            System.out.println("Element can not be removed.");
            return Integer.MIN_VALUE;
        }

        else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;

        return val;

    }

    // reverse a linkedlist
    public void reverseList() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    // remove nth node from last
    public void removeNthFromLast(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        // if not null
        int i = 1;
        int ifromstart = sz - n;
        Node prev = head;
        while (i < ifromstart) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // check if linkedlist is palindrome or not
    public ArrayList<Integer> storeElement() {
        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        return arr;
    }

    // palindrome function
    public boolean palindrome(ArrayList<Integer> arr) {

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            if (arr.get(left) != arr.get(right)) {
                return false;
            }
        }

        return true;
    }

    // detecting a cycle in linkedlist
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // remove cycle in linkedlist
    public void removeCycle() {

        // find cycle

        Node slow = head;
        Node fast = head;

        boolean cycle = true;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find point to remove

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle

        prev.next = null;
    }

    public static void main(String[] args) {

        linked_list ll = new linked_list();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(4);
        ll.addLast(5);

        ll.printList();

        ll.addMiddle(3, 2);
        ll.printList();

        ll.getSize();

        // ll.removeFirst();
        // ll.printList();

        System.out.println("The key found at index: " + ll.iterativeSearch(6));

        // System.out.println("The element that has got deleted: " + ll.removeLast());

        ll.printList();

        System.out.println(ll.iterativeSearch(4));

        ll.reverseList();

        ll.printList();

        // ll.removeNthFromLast(3);
        // ll.printList();

        ArrayList<Integer> arr = ll.storeElement();
        System.out.println("Is linkedlist palindrome or not: " + ll.palindrome(arr));

    }
}
