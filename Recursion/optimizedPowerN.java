package Recursion;

import java.util.Scanner;

public class optimizedPowerN {
    static int powerN(int x, int n) { // TC = O(logn)

        if (n == 0)
            return 1;

        int halPowersq = powerN(x, n / 2) * powerN(x, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halPowersq = x * halPowersq;
        }

        return halPowersq;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Power is: " + powerN(x, n));

        sc.close();

    }
}
