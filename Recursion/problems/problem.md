### Questions on Recursion

**_->Question 1: Find the occurence of a particular number_**

```java
package Recursion.problems;

import java.util.Scanner;

public class Question1 {
    static void allOccurence(int arr[], int key, int idx) {

        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        allOccurence(arr, key, idx + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements in the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        allOccurence(arr, key, 0);

        sc.close();

    }

}
```

**_-> Question 2: Convert the numbers into string (0 -> 'zero')_**

```java
package Recursion.problems;

import java.util.Scanner;
import java.util.Stack;

public class Question2 {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static String convertString(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {

            int digit = n % 10;
            switch (digit) {
                case 0:
                    sb.append("zero");
                    break;
                case 1:
                    sb.append("one");
                    break;
                case 2:
                    sb.append("two");
                    break;
                case 3:
                    sb.append("three");
                    break;
                case 4:
                    sb.append("four");
                    break;
                case 5:
                    sb.append("five");
                    break;
                case 6:
                    sb.append("six");
                    break;
                case 7:
                    sb.append("seven");
                    break;
                case 8:
                    sb.append("eight");
                    break;
                case 9:
                    sb.append("nine");
                    break;
            }

            sb.append(" ");
            n = n / 10;

        }
        return sb.toString();

    }

    static void convertString1(int n) {

        if (n == 0) {
            return;
        }

        convertString(n / 10);
        int lastdigit = n % 10;
        System.out.println(digits[lastdigit] + " ");

    }

    static void convertString2(int n) {

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int lastDigit = n % 10;
            sb.append(digits[lastDigit] + " ");
            n = n / 10;
        }

        String str = sb.toString();
        String arr[] = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    static void convertString3(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.push(n % 10);
            n = n / 10;
        }

        while (!stack.isEmpty()) {
            System.out.print(digits[stack.pop()] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be converted in string: ");
        int n = sc.nextInt();

        System.out.println(convertString(n));

        convertString1(n);

        // by the help of StringBuilder and String array data structure
        convertString2(n);

        // by the use of stack data structure
        convertString3(n);

        sc.close();

    }
}
```

**_-> Question 3: Write a program by using recursion to find the length of the string_**

```java
package Recursion.problems;

import java.util.Scanner;

public class Question3 {
    static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(length(str));

        sc.close();
    }
}
```
