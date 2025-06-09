package Arrays;

public class largestInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 3, 5 };
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest Element in the Array is: " + largest);
    }
}
