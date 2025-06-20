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
