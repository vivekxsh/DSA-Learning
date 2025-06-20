package strings;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }

    static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // return isPalindrome(str, start + 1, end - 1);
        return isPalindrome(str, ++start, --end);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = sc.nextLine();

        System.out.println("Checking palindrome without use of recursion.");
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }

        System.out.println("Checking palindrome with use of recursion.");
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome number.");
        } else {
            System.out.println(str + " is not a palindrome number.");
        }

        sc.close();

    }
}
