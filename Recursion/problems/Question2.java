package Recursion.problems;

import java.util.Scanner;

public class Question2 {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static String convertString(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {

            int digit = n % 10;
            switch (digit) {
                case 0:
                    sb.append("zero");
                    break;
                case 1:
                    sb.append("one");
                    break;
                case 2:
                    sb.append("two");
                    break;
                case 3:
                    sb.append("three");
                    break;
                case 4:
                    sb.append("four");
                    break;
                case 5:
                    sb.append("five");
                    break;
                case 6:
                    sb.append("six");
                    break;
                case 7:
                    sb.append("seven");
                    break;
                case 8:
                    sb.append("eight");
                    break;
                case 9:
                    sb.append("nine");
                    break;
            }

            sb.append(" ");
            n = n / 10;

        }
        return sb.toString();

    }

    static void convertString1(int n) {

        if (n == 0) {
            return;
        }

        convertString(n / 10);
        int lastdigit = n % 10;
        System.out.println(digits[lastdigit] + " ");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be converted in string: ");
        int n = sc.nextInt();

        System.out.println(convertString(n));

        convertString1(n);

        sc.close();

    }
}
