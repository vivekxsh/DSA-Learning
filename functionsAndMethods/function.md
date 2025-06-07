# FUNCTIONS OR METHODS

**In general English, "function" means some work.**

**_In Java, a function (more accurately called a method) is a block of code that can be reused._**

![FUNCTION](image.png)

### SYNTAX

![syntax](image2.png)

**_Functions without parameter:_**

```java
package functionsAndMethods;

public class functionsWithoutPara {

    public static void printHello() {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {

        // Calling the function
        printHello();

    }
}

```

**_Functions with parameter_**
![With parameter](image3.png)

CODE

```java
package functionsAndMethods;

import java.util.Scanner;

public class functionwithpara {

    // Function to add two numbers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        sc.close();
    }
}


```

![What happen in the memory](image4.png)
