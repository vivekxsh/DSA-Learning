package functionsAndMethods;

public class callByValue {

    public static void swap(int a, int b) {
        // swap by the help of temprary variable
        int temp = a;
        a = b;
        b = temp;

        // swap without using temporary variable
        /*
         * a = a + b;
         * b = a - b;
         * a = a - b;
         */

        /*
         * This function swaps the values of a and b, but since Java is a pass-by-value
         * (call-by-value)
         * language, the original values of a and b in the main method remain unchanged.
         */

        System.out.println("The value of a and b in the swap functin");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // calling swap function
        swap(a, b); /*
                     * This will not change the value of a and b in the main method because
                     * it creates a copy of those variable and send that to swap function.
                     * Hence, After executing swap function it can not change original value of a
                     * and b.
                     */

        System.out.println("The value of a and b in the main method");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}
