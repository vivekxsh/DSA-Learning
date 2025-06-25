package Recursion;

import java.util.Scanner;

public class powerN {
    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * xPowerN(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("The power of (x power n) : " + xPowerN(x, n));

        sc.close();

    }

}
