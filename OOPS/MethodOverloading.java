package OOPS;

class Calculator {

    // Method Overloading concept the method names are but either the number of
    // arguments are different or data type of argument is different
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.sum(21, 22);
        cal.sum(2.8f, 9.1f);
        cal.sum(34, 32, 12);

    }
}
