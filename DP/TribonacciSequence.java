package DP;

public class TribonacciSequence {

    // ****** Calculate Tribonacci by using simple recursion ******
    public static int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

    }

    // ***** Calculate Tribonacci by using DP [Tabulation method] *****
    static int fibonacciDP(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

    // ***** Calculate Tribonacci by using DP [Memoization method] *****

    static int tribonacci(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = tribonacci(n - 1, dp) + tribonacci(n - 2, dp) + tribonacci(n - 3, dp);

        return dp[n];
    }

    // ***** Calculate Tribonacci By using Swapping technique *****

    @SuppressWarnings("unused")
    static int tribonacciSwap(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int prev1 = 0, prev2 = 0, prev3 = 1;
        for (int i = 3; i <= n; i++) {
            int trib = prev1 + prev2 + prev3;

            int temp = prev1;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = trib;
        }

        return prev3;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("Calculate Tribonacci using simple recursion.");
        for (int i = 0; i <= n; i++) {
            System.out.print(tribonacci(i) + " ");
        }
        System.out.println();

        System.out.println("Calculate Tribonacci by using DP [Tabulation method].");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciDP(i) + " ");
        }
        System.out.println();

        System.out.println("Calculate Tribonacci by using DP [Memoization method].");
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(tribonacci(i, dp) + " ");
        }
        System.out.println();

        System.out.println("Calculate Tribonacci By using Swapping technique.");
        for (int i = 0; i <= n; i++) {
            System.out.print(tribonacciSwap(i) + " ");
        }
        System.out.println();

    }
}
