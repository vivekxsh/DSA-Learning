package functionsAndMethods;

import java.util.Scanner;

public class functionwithpara {

    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        sc.close();
    }
}
