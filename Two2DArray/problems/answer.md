### Practice question

**_Question 1_**
**_Print the number of 7's that are in the 2D array_**

```java

// print the number of 7's present in 2d array

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        System.out.print("Rows: ");
        int row = sc.nextInt();
        System.out.print("Column: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col]; // {{3,7,8}, {8,8,7}}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the 2D Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element to find occurence: ");
        int element = sc.nextInt();

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == element) {
                    count++;
                }
            }
        }

        System.out.println("The number of " + element + "'s present in the 2D array is: " + count);
        sc.close();
    }
}
```

**_Question 2_**
**_Find the row sum for particular row_**

```java

import java.util.Scanner;

// print the sum of the 2nd row in the 2d array

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and columns of the 2D array: ");

        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Column: ");
        int col = sc.nextInt();

        System.out.println("Enter the elements in the 2D array: ");
        int arr[][] = new int[row][col];

        // {{1,4,9},{11,4,3},{2,2,3}}

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the 2D array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowSum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            rowSum += arr[1][i];
        }

        System.out.println("The row sum for 2nd row is: " + rowSum);

        sc.close();

    }
}
```

**_Question 3_**
**_Transpose of a matrix_**

```java

import java.util.Scanner;

public class Question3 {

    public static void transpose(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows and columns: ");
        System.out.print("Rows: ");
        int row = sc.nextInt();
        System.out.print("Columns: ");
        int col = sc.nextInt();

        System.out.println("Enter the elements in the 2D array: ");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the 2D Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the 2D array: ");
        transpose(arr, row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```
