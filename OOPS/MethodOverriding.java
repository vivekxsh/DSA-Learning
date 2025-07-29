package OOPS;

class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("deer eats");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Deer deer = new Deer();
        deer.eat();

    }
}
