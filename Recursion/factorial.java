package Recursion;

import java.util.Scanner;

public class factorial {
    static int factorialOfN(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialOfN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n for factorial: ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is: " + factorialOfN(n));

        sc.close();
    }

}
