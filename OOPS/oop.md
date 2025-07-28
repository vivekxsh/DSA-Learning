### OOP -> Object oriented programming

---

### What is OOPs?

OOPs is a programming paradigm based on the concept of **“objects”**, which can contain data (attributes) and code (methods). It helps in organizing complex programs by modeling real-world entities.

---

### Key Concepts of OOPs in Java:

1. **Class**

   - Blueprint or template for creating objects.
   - Defines attributes (fields) and behaviors (methods).

2. **Object**

   - Instance of a class.
   - Represents an entity with state and behavior.

3. **Encapsulation**

   - Wrapping data (variables) and code (methods) together into a single unit (class).
   - Data hiding using access modifiers (`private`, `public`, `protected`).
   - Example: Using getters and setters to access private data.

4. **Inheritance**

   - Mechanism where one class acquires properties and behaviors (methods) of another class.
   - Promotes code reuse.
   - Syntax: `class Child extends Parent`

5. **Polymorphism**

   - Ability to take many forms.
   - Two types in Java:
     - **Compile-time Polymorphism (Method Overloading)**: Same method name, different parameters.
     - **Run-time Polymorphism (Method Overriding)**: Subclass provides specific implementation of a method already defined in parent class.

6. **Abstraction**
   - Hiding complex implementation details and showing only essential features.
   - Achieved using abstract classes and interfaces.

---

### Example to illustrate OOPs concepts in Java:

```java
// Class definition
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Encapsulation: getter method
    public String getName() {
        return name;
    }

    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Inheritance and Polymorphism
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Overriding method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        myAnimal.sound();  // Output: Animal makes a sound

        Dog myDog = new Dog("Buddy");
        myDog.sound();     // Output: Dog barks

        System.out.println("Dog's name is: " + myDog.getName());
    }
}
```

---

### What are Access Modifiers?

Access modifiers in Java control the **visibility** and **accessibility** of classes, methods, and variables. They define **who can access** these members.

---

![modifiers](images/image.png)

### Types of Access Modifiers in Java

| Modifier                  | Class | Package | Subclass (same package) | Subclass (different package) | World (everywhere) |
| ------------------------- | ----- | ------- | ----------------------- | ---------------------------- | ------------------ |
| **public**                | Yes   | Yes     | Yes                     | Yes                          | Yes                |
| **protected**             | Yes   | Yes     | Yes                     | Yes                          | No                 |
| **default** (no modifier) | Yes   | Yes     | Yes                     | No                           | No                 |
| **private**               | Yes   | No      | No                      | No                           | No                 |

---

### Detailed Explanation

1. **public**

   - The member is accessible **from anywhere** in your program.
   - Used when you want to make your class, method, or variable globally accessible.

2. **private**

   - The member is accessible **only within the class** where it is declared.
   - Most restrictive access level, mainly used for encapsulation.

3. **protected**

   - The member is accessible within the **same package** and also by **subclasses** (even if they are in different packages).
   - Useful for inheritance where subclasses need access to superclass members.

4. **default (package-private)**
   - No keyword (just omit any modifier).
   - The member is accessible only **within the same package**.
   - Not accessible from subclasses or classes outside the package.

---

```java
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String newPass) {
        this.password = newPass;
    }

    public void printPassword() {
        System.out.println(password);
    }
}
```

---

### Getter and Setter

![getter setter](images/image1.png)

### What are Getters and Setters?

- **Getters** and **Setters** are methods used to **access** and **update** the value of private variables from outside the class.
- They are part of the **Encapsulation** principle in OOP, which hides the internal state of an object and allows controlled access.

---

### Why use Getters and Setters?

- To **protect** your variables from unauthorized or invalid access/modification.
- To **control** how a variable is accessed or updated (e.g., validation before setting a value).
- To maintain **flexibility** by not exposing variables directly.

---

### How to write Getters and Setters?

- **Getter:** Returns the value of a private variable.
- **Setter:** Sets or updates the value of a private variable.

---

### Example

```java
package OOPS;

public class GetAndSet {

    public static void main(String[] args) {
        Pen2 p1 = new Pen2();
        p1.setColor("Blue");

        System.out.println(p1.getColor());

        // set tip
        p1.setTip(5);

        System.out.println(p1.getTip());

    }

}

class Pen2 {
    private String color;
    private int tip;

    // getter for pen color
    String getColor() {
        return this.color;
    }

    // setter for pen color
    void setColor(String color) {
        this.color = color;
    }

    // getter for pen tip
    int getTip() {
        return this.tip;
    }

    // setter for pen tip
    void setTip(int tip) {
        this.tip = tip;
    }
}
```

---

## 🏛️ 1. **Encapsulation**

![encapsulation](images/image2.png)

---

> **Definition:** Bundling data (variables) and methods (functions) that operate on the data into a single unit (class), and restricting direct access to some of the object's components.

- Achieved using **private fields** and **public getters/setters**.
- Promotes **data hiding** and **security**.

**Example:**

```java
class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

## 🧬 2. **Inheritance**

> **Definition:** A mechanism where one class acquires the properties and behaviors of another class.

- Promotes **code reusability**.
- `extends` keyword is used.

**Example:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

## 🎭 3. **Polymorphism**

> **Definition:** One interface, many implementations. An object can take many forms.

### Two types:

- **Compile-time (Method Overloading)**
- **Run-time (Method Overriding)**

**Example (Overriding):**

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

## 🌫️ 4. **Abstraction**

> **Definition:** Hiding internal implementation details and showing only essential features.

- Achieved using **abstract classes** or **interfaces**.
- Focuses on **what** an object does, not **how** it does it.

**Example:**

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}
```

---

### 📌 Summary Table

| Pillar        | Key Concept         | Benefit                        |
| ------------- | ------------------- | ------------------------------ |
| Encapsulation | Data hiding         | Security & Control             |
| Inheritance   | Reuse behavior      | Code reusability               |
| Polymorphism  | Many forms          | Flexibility & Scalability      |
| Abstraction   | Hide implementation | Simplicity & Focus on behavior |

---

### 🏗️ Constructor in OOP (Java)

![constructor](images/image3.png)

---

A **constructor** in Java is a **special method** used to **initialize objects** of a class. It is called **automatically** when a new object is created using the `new` keyword.

---

## 🔑 Key Features of Constructors:

- Has the **same name** as the class.
- **No return type**, not even `void`.
- Can be **overloaded** (i.e., you can have multiple constructors with different parameters).
- Called **automatically** when the object is created.

---

## 🧱 Types of Constructors in Java

### 1. **Default Constructor**

- Provided by Java if no constructor is defined.
- Takes no arguments.

```java
class Car {
    Car() {
        System.out.println("Car object created");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Output: Car object created
    }
}
```

---

### 2. **Parameterized Constructor**

- Takes arguments to initialize the object with specific values.

```java
class Car {
    String model;

    Car(String m) {
        model = m;
    }

    void show() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        myCar.show();  // Output: Model: Tesla
    }
}
```

---

### 3. **Copy Constructor** _(Manually defined in Java)_

- Used to create a copy of an existing object.

```java
class Car {
    String model;

    Car(String m) {
        model = m;
    }

    // Copy constructor
    Car(Car c) {
        model = c.model;
    }

    void show() {
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car(car1);  // Copy of car1
        car2.show();  // Output: Model: BMW
    }
}
```

---

## 🧠 Why Use Constructors?

- To ensure every object is initialized properly.
- Improves **readability** and **maintainability**.
- Supports **constructor overloading** for flexible initialization.

---

## 🔄 Constructor vs Method

| Feature     | Constructor       | Method                 |
| ----------- | ----------------- | ---------------------- |
| Name        | Same as class     | Any valid name         |
| Return Type | No return type    | Must have return type  |
| Called When | Object is created | Called explicitly      |
| Purpose     | Initialize object | Define object behavior |

---

### 🔁 Shallow Copy vs Deep Copy in Java

![copy type](images/image4.png)

---

In Java, **copying an object** can be done in two main ways: **shallow copy** and **deep copy**.

These refer to how the copy handles **object references** inside the original object.

---

## 🌊 Shallow Copy

### ✅ Definition:

A **shallow copy** copies the object and **only references** to other objects. The nested objects are **not copied**, just their **references**.

> Both original and copy share the same sub-objects.

---

## 🧱 Deep Copy

### ✅ Definition:

A **deep copy** creates a **fully independent copy** of the object, including its referenced objects.

> Original and copy do **not** share references.

---

## 🧠 Summary Table

| Feature           | Shallow Copy                         | Deep Copy                              |
| ----------------- | ------------------------------------ | -------------------------------------- |
| Copies Object     | ✅ Yes                               | ✅ Yes                                 |
| Copies References | ✅ (shared)                          | ❌ (creates new copies)                |
| Memory Usage      | Low                                  | Higher (due to duplicated sub-objects) |
| Independence      | ❌ Changes affect original copy      | ✅ Fully independent                   |
| Complexity        | Simple (use `clone()` or assignment) | More complex (manual cloning needed)   |

---
