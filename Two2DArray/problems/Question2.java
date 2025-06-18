package Two2DArray.problems;

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
