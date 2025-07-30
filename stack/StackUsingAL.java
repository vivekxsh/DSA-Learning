package stack;

import java.util.ArrayList;

public class StackUsingAL {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        /*
         * stack operations:-
         * isEmpty();
         * push();
         * pop();
         * peek();
         */

        // isEmpty
        boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }

        public int size() {
            return list.size();
        }

    }

    // @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {

            System.out.println(s.peek());

            s.pop();

        }

    }

}
