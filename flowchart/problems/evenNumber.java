
// Question 3: Flowchart to print the Even numbers between 9 and 100.

package flowchart.problems;

public class evenNumber {
    public static void main(String[] args) {
        int number = 9;

        System.out.println("Even numbers from " + number + " to 100 are: ");
        for (int i = number; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
        System.out.println();
    }
}
