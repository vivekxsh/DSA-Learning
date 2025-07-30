package OOPS;

// base class / parent class
class Animal3 {
    String skinColor;

    void eat() {
        System.out.println("Animals do eat.");
    }

    void breathe() {
        System.out.println("Animals do breathe.");
    }
}

// derived class / subclass
class Fish extends Animal3 {
    int fins;

    void swim() {
        System.out.println("swim in water.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Fish f1 = new Fish();
        f1.eat();

    }
}
