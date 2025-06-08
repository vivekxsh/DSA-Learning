package functionsAndMethods;

import java.util.Scanner;

public class binaryToDecimal {

    // Function to convert binary to decimal

    /*
     * static int binToDecimal(int binary) {
     * int decimal = 0;
     * int base = 1;
     * 
     * while (binary != 0) {
     * int lastDigit = binary % 10;
     * decimal = decimal + lastDigit * base;
     * base = base * 2;
     * binary = binary / 10;
     * }
     * 
     * return decimal;
     * }
     */

    static int binToDecimal(int binary) {
        int decimal = 0;
        int pow = 0;

        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binary = binary / 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        int decimal = binToDecimal(binary);
        System.out.println("The decimal number of the binary number " + binary + " is: " + decimal);
        sc.close();
    }
}
