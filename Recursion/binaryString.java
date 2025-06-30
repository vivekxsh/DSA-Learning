package Recursion;

import java.util.Scanner;

public class binaryString {
    public static void printBinaryString(int n, int lastPlace, StringBuilder str) {

        // base case
        if (n == 0) {
            System.out.println(str.toString());
            return;
        }

        // kaam
        printBinaryString(n - 1, 0, str.append("0"));
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str.append("1"));
        }

    }

    public static void printBinaryString2(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        printBinaryString2(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString2(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        // printBinaryString(n, 0, new StringBuilder());

        printBinaryString2(n, 0, "");

        sc.close();

    }
}
