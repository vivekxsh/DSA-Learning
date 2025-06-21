package strings.problems;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("count the number of lowercase character present in the string.");

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count++;
            }

        }

        System.out.println("The count of lowercase charater in the string -> (" + str + ") is " + count);

        sc.close();

    }
}
