package Two2DArray;

import java.util.Scanner;

public class searchInSortedMatrix {

    public static boolean stairCaseSearch(int[][] arr, int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Element found at position: (" + row + ", " + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        System.out.print("Rows: ");
        int n = sc.nextInt();
        System.out.print("Column: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the 2D Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the 2D Array are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        if (stairCaseSearch(arr, key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
