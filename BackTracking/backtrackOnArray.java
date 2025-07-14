package BackTracking;

public class backtrackOnArray {

    public static void changeArr(int[] arr, int i, int val) {

        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // kaam

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; // Backtrack while returning and reduce the value by 2

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
}
