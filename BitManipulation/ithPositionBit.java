package BitManipulation;

import java.util.Scanner;

public class ithPositionBit {

    static int getIthBit(int n, int i) {
        int bitmask = (1 << i);

        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the ith position: ");
        int i = sc.nextInt();

        System.out.println("The ith position bit is : " + getIthBit(n, i));

        sc.close();
    }
}
