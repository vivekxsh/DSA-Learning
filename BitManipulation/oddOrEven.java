package BitManipulation;

import java.util.Scanner;

public class oddOrEven {
    public static void oddEven(int n) {

        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether the number is odd or even : ");
        int n = sc.nextInt();

        oddEven(n);

        sc.close();

    }
}
