package Queue.Questions;

import java.util.Queue;
import java.util.LinkedList;

public class Question1 {

    public static String binaryString(int num) {
        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int digit = num % 2;
            binary.append(digit);
            num = num / 2;
        }

        return binary.reverse().toString();
    }

    public static void generateBinaryNumber(int n) {

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String binary = queue.remove();
            System.out.println(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");

        }

    }

    public static void main(String[] args) {
        int n = 10;

        generateBinaryNumber(n);

        // for (int i = 1; i <= n; i++) {
        // System.out.println(binaryString(i));
        // }

    }
}
