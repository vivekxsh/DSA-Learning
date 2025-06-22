package BitManipulation;

import java.util.Scanner;

public class setIthPostion {

    static int setIthBit(int n, int i) {
        int bitmask = (1 << i);

        return n | bitmask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter ith bit: ");
        int i = sc.nextInt();

        System.out.println(setIthBit(n, i));

    }
}
