package Recursion;

public class tilingProblem {
    public static int findWays(int n) {
        // base case

        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam (work)

        // vertical choice
        int fnm1 = findWays(n - 1);

        // horizontal choice
        int fnm2 = findWays(n - 2);

        // total ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {

        System.out.println(findWays(4));

    }

}
