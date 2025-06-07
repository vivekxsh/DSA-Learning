package functionsAndMethods;

import java.util.Scanner;

public class binomialCoefficient {

    // Function to calculate Binomial Coefficient C(n,r)
    static int calculateBinomialCoefficient(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }

        return calculateBinomialCoefficient(n - 1, r - 1) + calculateBinomialCoefficient(n - 1, r);
    }

    public static void main(String[] args) {
        // Binomial Coefficient is a way to calculate the number of ways to choose k
        // elements from a set of n elements.
        // It is denoted as C(n, k) or nCk and is calculated using the formula:
        // C(n, r) = n! / (r! * (n - r)!)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int binomialCoefficient = calculateBinomialCoefficient(n, r);
        System.out.println("The Binomial Coefficient C(" + n + ", " + r + ") is: " + binomialCoefficient);
        sc.close();
    }
}
