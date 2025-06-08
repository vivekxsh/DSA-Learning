package functionsAndMethods;

import java.util.Scanner;

public class primesInRange {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
