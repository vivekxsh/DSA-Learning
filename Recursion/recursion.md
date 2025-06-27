### Recursion -> (Recursion is a method of solving a computational problem where the solution depends on a solutions to smallerinstance of the same problem)

**_-> In other words a function that calls itself_**

![Recursion](image.png)
![Recursion](image1.png)
![Recusion](image2.png)

**_-> How a recursive function gets called_**
![call of function](image3.png)

**_-> Three steps in recursive function_**
![three steps](image4.png)

**_-> Problem to print a number from n to 1 in decreasing order_**
![print num](image5.png)
![print num](image6.png)

```java
package Recursion;

import java.util.Scanner;

public class printNumberFromNto1 {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumber(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printNumber(n);
        sc.close();
    }
}
```

**_Stack Overflow_**
![overflow](image7.png)

**_-> Problem to print a number from 1 to n increasing order_**
![print number](image8.png)
**_Call Stack_**
![call stack](image9.png)

```java
package Recursion;

import java.util.Scanner;

public class printNumberFrom1toN {
    public static void printNumber(int n) {

        if (n == 0) {
            return;
        }

        printNumber(n - 1);

        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printNumber(n);

        sc.close();
    }
}
```

**_-> Problem to calculate the factorial of n_**
**_(0! = 1)_**
![factorial](image10.png)

```java
package Recursion;

import java.util.Scanner;

public class factorial {
    static int factorialOfN(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialOfN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n for factorial: ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is: " + factorialOfN(n));

        sc.close();
    }

}
```

**_-> Problem to calculate sum of n natural number_**
![Natural sum](image11.png)

```java
package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static int NaturalSum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + (NaturalSum(n - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        System.out.println("Sum of N natural number: " + NaturalSum(n));

        sc.close();
    }
}
```

**_-> Problem to print nth fibonacci number_**
![fibonacci](image12.png)
![fibonacci](image13.png)
![fibonacci](image14.png)

```java
package Recursion;

import java.util.Scanner;

public class fibonacci {
    static int fibonacciNumber(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to get fibonacci: ");
        int n = sc.nextInt();

        System.out.println("The nth fibonacci number is: " + fibonacciNumber(n));

        sc.close();
    }
}
```

**_-> Problem to check whether the array is sorted or not_**
![sorted](image15.png)

```java
package Recursion;

import java.util.Scanner;

public class arrayIsSortedOrNot {
    public static boolean isSorted(int arr[], int index) {

        if (arr.length <= 1 || index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array: ");

        int arr[] = new int[n];

        // arr={12,34,45,56,89};

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));

        sc.close();

    }
}
```

**_-> Find the first occurence of the element in an array_**
![occurence](image16.png)

**_Stack Analysis_**
![stack analysis](image17.png)

```java
package Recursion;

import java.util.Scanner;

public class firstOccurence {
    public static int fOccurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (key == arr[index]) {
            return index;
        }

        return fOccurence(arr, key, index + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value: ");
        int key = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println("The first occurence of the element found at: " + fOccurence(arr, key, 0));

        sc.close();

    }
}
```

**_-> Find the last occurence of the element in an array_**
![occurence](image18.png)

```java
package Recursion;

import java.util.Scanner;

public class lastOccurence {
    static int lOccurence(int arr[], int key, int index) {

        if (index < 0) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return lOccurence(arr, key, index - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key value: ");
        int key = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements in the array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // arr[] = {8,3,6,9,5,10,2,5,3}

        System.out.println("The last occurence found at: " + lOccurence(arr, key, n - 1));

        sc.close();

    }
}
```

**_-> Find the power of x power n_**
**_TC = O(n)_**
![power](image19.png)
**_Call Stack_**
![call stack](image20.png)
![call stack](image21.png)

```java
package Recursion;

import java.util.Scanner;

public class powerN {
    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * xPowerN(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("The power of (x power n) : " + xPowerN(x, n));

        sc.close();

    }

}
```

**_-> optimized code to calculate power of x and n_**
**_TC = O(logn)_**
![power](image22.png)
![power](image23.png)

```java
package Recursion;

import java.util.Scanner;

public class optimizedPowerN {
    static int powerN(int x, int n) { // TC = O(logn)

        if (n == 0)
            return 1;

        int halPowersq = powerN(x, n / 2) * powerN(x, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halPowersq = x * halPowersq;
        }

        return halPowersq;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Power is: " + powerN(x, n));

        sc.close();

    }
}
```

**_-> Tiling Problem_**
**_Solve the tiling problem where you are supposed to find the number of ways to arrange tiles on the floor_**
![tiling](image24.png)
![tiling](image25.png)
![tiling](image26.png)
![tiling](image27.png)
![tiling](image28.png)
