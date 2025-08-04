package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // 'a' -> 'z'
        Queue<Character> q = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            }
            System.out.print(q.peek() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // String str = "aabxxccbvsrt";
        // String str = "aabccxb";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        printNonRepeating(str);

        sc.close();

    }
}
