package functionsAndMethods.problems;

import java.util.Scanner;

public class digitSum {

    static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to calculate the sum of its digits: ");
        int num = sc.nextInt();

        System.out.println("The sum of the digits are : " + sum(num));

        sc.close();
    }
}
