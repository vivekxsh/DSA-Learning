package Heaps.PriorityQueue.Questions;

import java.util.PriorityQueue;

public class Question5 {

    public static PriorityQueue<Integer> mergeSortedArray(int list1[], int list2[], int list3[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < list1.length; i++) {
            pq.offer(list1[i]);
        }

        for (int i = 0; i < list2.length; i++) {
            pq.offer(list2[i]);
        }

        for (int i = 0; i < list3.length; i++) {
            pq.offer(list3[i]);
        }

        return pq;
    }

    public static void main(String[] args) {

        int list1[] = { 1, 3, 7 };
        int list2[] = { 2, 4, 8 };
        int list3[] = { 9, 10, 11 };

        PriorityQueue<Integer> pq = mergeSortedArray(list1, list2, list3);

        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }

    }
}
