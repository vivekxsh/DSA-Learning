package strings;

import java.util.Scanner;

public class stringCompresion {

    static String compressedString(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }

        }

        return newStr;

    }

    public static void main(String[] arga) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String ans = compressedString(str);
        System.out.println("String compression: " + ans);

        sc.close();

    }
}
