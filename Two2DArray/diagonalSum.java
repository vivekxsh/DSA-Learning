package Two2DArray;

import java.util.Scanner;

public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the square matrix: ");
        System.out.print("Rows: ");
        int n = sc.nextInt();
        System.out.print("Columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                } else if (i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("The sum of the diagonal elements is: " + sum);
        sc.close();

    }
}
