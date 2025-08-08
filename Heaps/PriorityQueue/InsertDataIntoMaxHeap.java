package Heaps.PriorityQueue;

import java.util.ArrayList;

public class InsertDataIntoMaxHeap {
    static class Heap {

        ArrayList<Integer> maxHeap = new ArrayList<>();

        public void add(int data) {

            maxHeap.add(data);

            int x = maxHeap.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (maxHeap.get(x) > maxHeap.get(par)) {
                // swap values
                int temp = maxHeap.get(x);
                maxHeap.set(x, maxHeap.get(par));
                maxHeap.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return maxHeap.get(0);
        }

        private void heapify(int idx) {
            int left = idx * 2 + 1;
            int right = idx * 2 + 2;
            int minIdx = idx;

            if (left < maxHeap.size() && maxHeap.get(left) > maxHeap.get(minIdx)) {
                minIdx = left;
            }

            if (right < maxHeap.size() && maxHeap.get(right) > maxHeap.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                int temp = maxHeap.get(minIdx);
                maxHeap.set(idx, maxHeap.get(minIdx));
                maxHeap.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove() {

            int data = maxHeap.get(0);

            // swap with last index
            int temp = maxHeap.get(0);
            maxHeap.set(0, maxHeap.get(maxHeap.size() - 1));
            maxHeap.set(maxHeap.size() - 1, temp);

            // heapify

            heapify(0);

            return data;

        }

        public boolean isEmpty() {
            return maxHeap.size() == 0;
        }
    }

    public static void main(String[] args) {
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
