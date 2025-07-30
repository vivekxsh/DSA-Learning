package stack.Questions;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            stack.push(str.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        String str = "india";

        System.out.println("Reversed string: " + reverseString(str));

    }
}
