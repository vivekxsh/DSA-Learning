package strings.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = sc.nextLine();

        char[] string1Arr = string1.toCharArray();
        Arrays.sort(string1Arr);
        String sortedString1 = new String(string1Arr);

        char[] string2Arr = string2.toCharArray();
        Arrays.sort(string2Arr);
        String sortedString2 = new String(string2Arr);

        if (sortedString1.equals(sortedString2)) {
            System.out.println("Strings are anagram.");
        } else {
            System.out.println("Strings are not anagram.");
        }

        sc.close();

    }
}
