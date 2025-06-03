package flowchart;

import java.util.Scanner;

public class N_naturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer N: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println("The sum of first natural number is: " + sum);
        sc.close();
    }
}