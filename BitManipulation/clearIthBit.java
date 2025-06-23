package BitManipulation;

import java.util.Scanner;

public class clearIthBit {

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);

        return n & bitmask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the position of the bit to be get cleared: ");
        int i = sc.nextInt();

        System.out.println("After clearing the ith bit: " + clearBit(n, i));

        sc.close();

    }
}
