package OOPS;

class Animal2 {
    String color;

    Animal2() {
        System.out.println("Animal constructor is called");
    }
}

class Horse2 extends Animal2 {
    Horse2() {
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}

public class Super {
    public static void main(String[] args) {

        Horse2 h = new Horse2();
        System.out.println(h.color);

    }
}
