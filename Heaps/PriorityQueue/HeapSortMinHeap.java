package Heaps.PriorityQueue;

public class HeapSortMinHeap {

    public static void heapify(int arr[], int i, int size) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int minIdx = i;

        if (left < size && arr[left] < arr[minIdx]) {
            minIdx = left;
        }
        if (right < size && arr[right] < arr[minIdx]) {
            minIdx = right;
        }

        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, size);
        }
    }

    public static void heapSort(int arr[]) {

        // build MinHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // push smallest at end
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3 };

        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
