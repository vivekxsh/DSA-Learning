package Heaps.PriorityQueue;

import java.util.ArrayList;

public class InsertDataIntoMinHeap {
    static class Heap {
        ArrayList<Integer> heap = new ArrayList<>();

        public void add(int data) {

            // insert data at the last index
            heap.add(data);

            int x = heap.size() - 1; // x is child index
            int par = (x - 1) / 2;

            while (heap.get(x) < heap.get(par)) {

                // swaping
                int temp = heap.get(x);
                heap.set(x, heap.get(par));
                heap.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return heap.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < heap.size() && heap.get(minIdx) > heap.get(left)) {
                minIdx = left;
            }
            if (right < heap.size() && heap.get(minIdx) > heap.get(right)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                int temp = heap.get(minIdx);
                heap.set(idx, heap.get(minIdx));
                heap.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove() {
            int data = heap.get(0);

            // swap first and last
            int temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.set(heap.size() - 1, temp);

            // remove last
            heap.remove(heap.size() - 1);

            // heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return heap.size() == 0;
        }
    }

    public static void main(String[] args) {

        // similar to PriorityQueue in fact PriorityQueue internally implements this
        // heap structure

        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while (!heap.isEmpty()) {
            System.out.println(heap.peek());
            heap.remove();
        }

    }
}
