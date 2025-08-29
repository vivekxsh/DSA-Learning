package DP;

public class Fibonacci {

    // ******* Recursion based fibonacci code || Time complexity-> O(2^n) & Space
    // Complexity-> O(n) [due to stack calls]*********
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // ****** Calculate fibonacci by using DP (Tabulation (Bottom-Up) method) ||
    // Time
    // complexity-> O(n) & Space complexity-> O(n) *******
    public static int fibonacciDP(int n) {

        if (n <= 1) {
            return n;
        }

        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // ****** Calculate fibonacci by using dp (Memoization (Top-Down) method) ||
    // Time Complexity-> O(n) & Space complexity-> O(n) *******
    public static int fibonacci(int n, int dp[]) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

        return dp[n];
    }

    // ******* Normal function by swapping the values || Time complexity-> O(n) &
    // Space complexity-> O(1) ***********
    @SuppressWarnings("unused")
    public static int fibonacciSwapping(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 0;
        int fib1 = 0, fib2 = 1;

        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;

            int temp = fib1;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println("Calculate fibonacci by recursive calls: " + fibonacci(n));
        System.out.println("Calculate fibonacci by DP (Dynamic Programming)-[Tabulation method] : " + fibonacciDP(n));
        System.out.println("Calculate fibonacci by swapping values : " + fibonacciSwapping(n));

        System.out.println("DP Memoization (Top-Down) method.");
        int dp[] = new int[n + 1];
        System.out.println("Calculate fibonacci by DP [Memoization (Top-Down) method] : " + fibonacci(n, dp));
    }
}
