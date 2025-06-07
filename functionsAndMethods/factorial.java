package functionsAndMethods;

import java.util.Scanner;

public class factorial {

    // Function to calculate factorial of a number
    static int calculateFactorial(int n) {
        /*
         * Using recursive approach to calculate factorial
         */
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);

        /*
         * Using iterative(for loop) approach to calculate factorial
         */
        // int factorial = 1;
        // for (int i = 1; i <= n; i++) {
        // factorial = factorial * i;
        // }
        // return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
        sc.close();

    }
}
