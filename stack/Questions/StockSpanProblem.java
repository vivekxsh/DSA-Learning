package stack.Questions;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {

    public static int[] stockSpan(int stock[]) {
        int span[] = new int[stock.length];

        Stack<Integer> spanStock = new Stack<>();

        span[0] = 1;
        spanStock.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!spanStock.isEmpty() && currPrice > stock[spanStock.peek()]) {
                spanStock.pop();
            }

            if (spanStock.isEmpty()) {
                span[i] = i + 1;
            }

            span[i] = i - spanStock.peek();
            spanStock.push(i);

        }

        return span;

    }

    public static void main(String[] args) {
        // int arr[] = { 100, 80, 60, 70, 60, 85, 100 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the stock array size: ");
        int n = sc.nextInt();
        System.out.print("Enter the stock array values: ");
        int stock[] = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int span[] = stockSpan(stock);

        for (int i = 0; i < span.length; i++) {
            System.out.print((i < span.length - 1) ? span[i] + ", " : span[i]);
        }

        sc.close();

    }

}
