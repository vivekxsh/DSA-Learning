package stack.Questions;

import java.util.Stack;
import java.util.Scanner;

public class ValidParantheses {
    public static boolean parantheses(String brackets) {

        Stack<Character> storeParantheses = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                storeParantheses.push(bracket);
            }

            else {
                if (storeParantheses.isEmpty()) {
                    return false;
                }
                char top = storeParantheses.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == '}' && top != '{') ||
                        (bracket == ']' && top != '[')) {
                    return false;
                }

            }
        }

        return storeParantheses.isEmpty();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a parantheses string: ");
        String brackets = sc.nextLine();

        System.out.println((parantheses(brackets)) ? brackets + " is a valid parantheses."
                : brackets + " is not a valid parantheses.");

        sc.close();

    }
}
