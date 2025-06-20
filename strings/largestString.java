package strings;

import java.util.Scanner;

public class largestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        // str = "apple mango banana";

        String arr[] = str.split(" ");

        int len = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (s.length() > len) {
                len = s.length();
            }
        }

        System.out.println("Leargest length: " + len);

        sc.close();

    }
}
