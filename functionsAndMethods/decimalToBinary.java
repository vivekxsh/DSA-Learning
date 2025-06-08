package functionsAndMethods;

import java.util.Scanner;

public class decimalToBinary {

    // Function to convert decimal to binary
    static int decToBin(int decimal) {
        int binary = 0;
        int pow = 0;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = (remainder * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = decToBin(decimal);
        System.out.println("The Binary of the Decimal number " + decimal + " is: " + binary);

        sc.close();
    }
}
