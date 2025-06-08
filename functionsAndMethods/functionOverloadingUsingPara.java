package functionsAndMethods;

import java.util.Scanner;

// Function Overloading Example in Java
// This program demonstrates function overloading by defining multiple 'add' methods with different parameters.
public class functionOverloadingUsingPara {

    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("Addition of two numbers: " + add(a, b));
        System.out.println("Addition of three numbers: " + add(a, b, c));

        sc.close();
    }
}
