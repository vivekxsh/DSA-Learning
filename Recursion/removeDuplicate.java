package Recursion;

import java.util.Scanner;

public class removeDuplicate {

    public static void remoDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {

        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);

        if (map[(currChar - 'a')] == true) {
            remoDuplicate(str, idx + 1, newStr, map);
        } else {
            map[(currChar - 'a')] = true;
            remoDuplicate(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        // String str = "appnaccollegge";

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        remoDuplicate(str, 0, new StringBuilder(), new boolean[26]);

        sc.close();
    }

}
