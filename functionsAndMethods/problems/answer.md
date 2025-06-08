### Question 1 : Write a Java method to compute the average of three numbers.

```java
package functionsAndMethods.problems;

import java.util.Scanner;

public class calculateAverage {

    static double calAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        double average = calAverage(num1, num2, num3);
        System.out.print("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

        sc.close();
    }
}
```

### Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method

```java
package functionsAndMethods.problems;

import java.util.Scanner;

public class evenOrOdd {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked whether it is even or odd: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        sc.close();
    }
}
```

### Question 3 : Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A numberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321

```java
package functionsAndMethods.problems;

import java.util.Scanner;

public class palindrome {

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrom number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        sc.close();

    }
}
```

### Question 4 : READ & CODE EXERCISE

a. Math.min( ) – Returns the smaller of two values.
b. Math.max( ) – Returns the larger of two values.
c. Math.sqrt( ) – Returns the square root of x. Returns NaN for negative numbers.
d. Math.pow( ) - Returns a raised to the power of b.
e. Math.abs( ) – Returns the absolute (positive) value of x.

```java
package functionsAndMethods.problems;

import java.util.Scanner;

public class mathFunction {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();

       System.out.println("Math.min() function answer -> " + Math.min(a, b));
       System.out.println("Math.max() function answer -> " + Math.max(a, b));
       System.out.println("Math.sqrt() function answer -> " + Math.sqrt(a));
       System.out.println("Math.pow() function answer -> " + Math.pow(a, b));
       System.out.println("Math.abs() function answer -> " + Math.abs(a - b));

       sc.close();
   }
}
```

### Question 5 : Write a Java method to compute the sum of the digits in an integer.

```java
package functionsAndMethods.problems;

import java.util.Scanner;

public class digitSum {

    static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to calculate the sum of its digits: ");
        int num = sc.nextInt();

        System.out.println("The sum of the digits are : " + sum(num));

        sc.close();
    }
}
```
