package flowchart;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int div = 2;

        while (div < n) {
            if (n % div == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
            div++;

        }

        System.out.println(n + " is a prime number.");

    }
}