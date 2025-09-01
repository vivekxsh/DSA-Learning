package DP;

import java.util.Scanner;

public class ClimbingStairsVariation {

    // ******* Recusion method ******
    static int climbingStairs(int n) {

        if (n <= 2) {
            return n;
        }
        if (n == 3) {
            return 4;
        }

        return climbingStairs(n - 1) + climbingStairs(n - 2) + climbingStairs(n - 3);
    }

    // ******* Using DP *******
    static int climbingStairsDP(int n) {

        if (n <= 3) {
            if (n == 3) {
                return 4;
            } else {
                return n;
            }
        }

        int dp[] = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(climbingStairs(n));
        System.out.println(climbingStairsDP(n));

        sc.close();
    }
}
