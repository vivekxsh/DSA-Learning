package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static int NaturalSum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + (NaturalSum(n - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Sum of N natural number: " + NaturalSum(n));

        sc.close();
    }
}
