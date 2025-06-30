package Recursion;

import java.util.Scanner;

public class friendsPairing {

    public static int pairFriends(int n) {

        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // kaam
        // if user select single person
        // single
        int fnm1 = pairFriends(n - 1);

        // if it selects a pair
        // pair
        int fnm2 = pairFriends(n - 2);
        int pairWays = (n - 1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;

        return totalWays;

        /*
         * in shorthand we can write
         * return pairFriends(n - 1) + (n - 1) * pairFriends(n - 2);
         */

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");

        int n = sc.nextInt();

        System.out.println("The number of pair they can make is: " + pairFriends(n));

        sc.close();

    }
}
