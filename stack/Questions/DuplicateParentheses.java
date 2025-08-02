package stack.Questions;

import java.util.Stack;
import java.util.Scanner;

public class DuplicateParentheses {

    public static boolean hasDuplicateParentheses(String expression) {

        Stack<Character> parentheses = new Stack<>();
        for (char ch : expression.toCharArray()) {

            if (ch == ')') {
                int count = 0;

                while (!parentheses.isEmpty() && parentheses.peek() != '(') {

                    parentheses.pop();
                    count++;
                }

                if (!parentheses.isEmpty()) {
                    parentheses.pop();
                }

                if (count == 0) {
                    return true;
                }
            } else {
                parentheses.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = sc.nextLine();

        System.out.println(hasDuplicateParentheses(expression));

        sc.close();
    }

}
