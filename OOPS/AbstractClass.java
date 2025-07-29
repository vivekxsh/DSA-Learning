package OOPS;

abstract class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class AbstractClass {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chik = new Chicken();
        chik.eat();
        chik.walk();
    }

}
