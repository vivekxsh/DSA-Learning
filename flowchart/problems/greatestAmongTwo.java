// Question 2: Flowchart to find the greatest from 2 numbers. 

package flowchart.problems;

import java.util.Scanner;

public class greatestAmongTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("Both are equal");
        }

        sc.close();

    }
}
