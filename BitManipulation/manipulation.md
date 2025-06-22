### Bit Manipulation

**_Binary Number System_**
![number system](image.png)
![number system](image1.png)
![number system](image2.png)

**_Bitwise operator_**

![operator](image3.png)

**_Binary AND(&) operator_**
![AND operator](image4.png)

**_-> CODE_**

```java
package BitManipulation;

public class binaryAND {
    public static void main(String[] args) {
        System.out.println("The AND(&) operation of 5 and 6 is : " + (5 & 6));
    }
}
```

**_Binary OR ( | ) operator_**
![OR operator](image5.png)

**_-> CODE_**

```java
package BitManipulation;

public class binaryOR {
    public static void main(String[] args) {
        System.out.println("The binary OR( | ) operation on two number resulting in : " + (5 | 6));
    }
}
```

**_Binary XOR ( ^ ) operator_**
![XOR operator](image6.png)
**_-> CODE_**

```java
package BitManipulation;

public class binaryXOR {
    public static void main(String[] args) {
        System.out.println("The XOR(^) operation of two numbers : " + (5 ^ 6));
    }
}
```

**_Binary One's Complement_**
![complement](image7.png)
![complement](image8.png)
![complement](image9.png)

**_-> CODE_**

```java
package BitManipulation;

public class binaryOneComplement {
    public static void main(String[] args) {
        System.out.println((~0)); // result = -1
        System.out.println((~5)); // result = -6
    }
}
```
