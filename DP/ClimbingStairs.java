package DP;

import java.util.Scanner;

public class ClimbingStairs {

    // ****** Recursion solution O(2^n) ******
    static int climbingStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    // ****** DP(Dynamic programming) [Tabulation method] O(n) ******
    static int climbingStairsDP(int n) {

        if (n <= 2) {
            return n;
        }

        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Calculate climbing stairs by using recursion: " + climbingStairs(n));

        System.out.println("Calculate climbing stairs by using DP [Tabulation method]: " + climbingStairsDP(n));

        sc.close();

    }
}
