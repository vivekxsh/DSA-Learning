package Recursion.problems;

import java.util.Scanner;
import java.util.Stack;

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

    static void convertString2(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int lastDigit = n % 10;
            sb.append(digits[lastDigit] + " ");
            n = n / 10;
        }

        String str = sb.toString();
        String arr[] = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    static void convertString3(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        while (!stack.isEmpty()) {
            System.out.print(digits[stack.pop()] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be converted in string: ");
        int n = sc.nextInt();

        System.out.println(convertString(n));

        convertString1(n);

        // by the help of StringBuilder and String array data structure
        convertString2(n);

        // by the use of stack data structure
        convertString3(n);

        sc.close();

    }
}
