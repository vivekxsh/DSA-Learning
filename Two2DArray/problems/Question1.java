package Two2DArray.problems;

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
