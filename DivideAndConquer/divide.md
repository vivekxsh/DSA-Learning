### Divide and Conquer

![Divide and conquer](images/image.png)

**_-> Merge sort: Can be solved by using divide and conquer technique_**

![merge sort](images/image2.png)
![merge sort](images/image3.png)

**_TC = O(nlogn)_**
**_SC = O(n)_**

```java
package DivideAndConquer;

import java.util.Scanner;

// TC = O(nlogn)
// SC = O(n)

public class mergeSort {

    public static void mergersort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergersort(arr, si, mid); // recursively break left part
        mergersort(arr, mid + 1, ei); // recursively break right part

        // merge those parts
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp array values into original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements into array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergersort(arr, 0, n - 1);

        System.out.println("Array after sorting.");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
```
