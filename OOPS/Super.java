package OOPS;

class Animal2 {
    String color;

    Animal2() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal2 {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}

public class Super {
    public static void main(String[] args) {

        Horse h = new Horse();
        System.out.println(h.color);

    }
}
