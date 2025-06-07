package functionsAndMethods;

import java.util.Scanner;

public class productOfTwoNum {

    // Function to calculate the product of two number
    static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.println("The product of two numbers " + a + " and " + b + " is: " + product);
        sc.close();
    }
}
