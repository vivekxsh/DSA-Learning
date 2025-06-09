### ARRAYS --> Array is collection of similar types of data

![Creating array](image.png)

#### Operations on array

![operation](image1.png)

**_Linear Search_**
**_->Linear search, also known as sequential search, is a simple algorithm for finding a specific value in a list or array. It works by sequentially comparing each element in the data structure with the target value until a match is found or the end of the data structure is reached._**
![Linear search](image2.png)

#### CODE

```java
package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                break; // Exit the loop once the element is found
            }
        }
    }
}
```

#### -> Largest number in an array

#### CODE

```java
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
```
