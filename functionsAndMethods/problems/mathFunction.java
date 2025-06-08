package functionsAndMethods.problems;

import java.util.Scanner;

public class mathFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Math.min() function answer -> " + Math.min(a, b));
        System.out.println("Math.max() function answer -> " + Math.max(a, b));
        System.out.println("Math.sqrt() function answer -> " + Math.sqrt(a));
        System.out.println("Math.pow() function answer -> " + Math.pow(a, b));
        System.out.println("Math.abs() function answer -> " + Math.abs(a - b));

        sc.close();
    }
}
