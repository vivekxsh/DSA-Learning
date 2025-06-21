### String Data Structure

**_How to create String_**

```java
package strings;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };

        String str = new String(arr);

        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Get the string input from user : ");
        String s = sc.next();

        System.out.println(s);

        System.out.println("String length function");
        System.out.println(s.length());

        sc.close();

    }
}
```

**_Program to check whether given string is palindrome or not_**
**_-> CODE_**

```java
package strings;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }

    static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // return isPalindrome(str, start + 1, end - 1);
        return isPalindrome(str, ++start, --end);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = sc.nextLine();

        System.out.println("Checking palindrome without use of recursion.");
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }

        System.out.println("Checking palindrome with use of recursion.");
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome number.");
        } else {
            System.out.println(str + " is not a palindrome number.");
        }

        sc.close();

    }
}
```

**_Find shortest path in map_**
![image](image.png)
![image1](image1.png)

**_Program to find the shortest path_**
**_-> CODE_**

```java
package strings;

public class getShortestPath {

    static float shortestPath(String str) {

        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char path = str.charAt(i);

            // south
            if (path == 'S') {
                y--;
            }
            // North
            else if (path == 'N') {
                y++;
            }
            // West
            else if (path == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int x2 = x * x, y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float shortPath = shortestPath(path);

        System.out.println("Shortest path is: " + shortPath);

    }
}
```

**_Substring of the string_**
![substring](image2.png)

```java
package strings;

public class substr {

    public static String substring(String str, int si, int ei) {
        String subStr = "";

        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }

        return subStr;

    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        str = substring(str, 0, 5);
        System.out.println(str);
    }
}
```

**_Largest length of the string_**

```java
package strings;

import java.util.Scanner;

public class largestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        // str = "apple mango banana";

        String arr[] = str.split(" ");

        int len = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (s.length() > len) {
                len = s.length();
            }
        }

        System.out.println("Leargest length: " + len);

        sc.close();

    }
}
```

### -> Why Java Strings are Immutable?\*

**_In Java, strings are immutable means their values cannot be changed once they are created. This feature enhances performance, security, and thread safety. In this article, we are going to learn why strings are immutable in Java and how this benefits Java applications._**

### -> What Does Immutable Mean?\*

**_When we say something is immutable, it means that once it is created, it cannot be changed. In Java, this concept applies to strings, which means that once a string object is created, its content cannot be changed. If we try to change a string, Java does not modify the original one, it creates a new string object instead._**

### -> How are Strings Immutable in Java?\*

**_Java strings are immutable to make sure memory is used efficiently. Strings in Java that are specified as immutable as the content is shared storage in a single pool to minimize creating a copy of the same value. String class and all wrapper classes in Java that include Boolean, Character, Byte, Short, Integer, Long, Float, and Double are immutable. A user is free to create immutable classes of their own._**

### String V/S StringBuilder in java

### ->String

### Immutability:

**_String objects are immutable, meaning their value cannot be changed after creation. Any operation that appears to modify a String, such as concatenation, actually creates a new String object in memory._**

### Thread-Safety:

**_String objects are inherently thread-safe due to their immutability. Multiple threads can access a String without concerns about data corruption._**

### Performance:

**_For a small number of concatenations or when string content is largely static, String can be efficient. However, frequent modifications or concatenations lead to the creation of many intermediate String objects, which can be inefficient in terms of memory and performance._**

### ->StringBuilder

### Mutality:

**_StringBuilder objects are mutable, allowing their content to be modified directly without creating new objects for each change. Methods like append(), insert(), and delete() modify the StringBuilder in place._**

### Thread-Safety:

**_StringBuilder is not thread-safe. It is designed for use in single-threaded environments. If string manipulation is required in a multi-threaded context and thread-safety is crucial, StringBuffer (which is synchronized) should be used instead._**

### performance:

**_StringBuilder offers superior performance for frequent string modifications or concatenations, especially within loops, as it avoids the overhead of creating new objects repeatedly._**

**_-> String compression problem_**

```java
package strings;

import java.util.Scanner;

public class stringCompresion {

    static String compressedString(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;
            }

        }

        return newStr;

    }

    public static void main(String[] arga) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String ans = compressedString(str);
        System.out.println("String compression: " + ans);

        sc.close();

    }
}
```
