package functionsAndMethods.problems;

import java.util.Scanner;

public class evenOrOdd {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked whether it is even or odd: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        sc.close();
    }
}
