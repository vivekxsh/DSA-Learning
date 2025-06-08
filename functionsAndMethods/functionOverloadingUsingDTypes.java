package functionsAndMethods;

public class functionOverloadingUsingDTypes {

    /*
     * Function Overloading Example in Java
     * This program demonstrates function overloading by defining multiple 'add'
     * methods with different data types.
     */

    // Function to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Function to add two floats
    static float add(float a, float b) {
        return a + b;
    }

    // Function to add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Function to add two strings
    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two integers: " + add(5, 10));
        System.out.println("Addition of two floats: " + add(5.4f, 6.9f));
        System.out.println("Addition of two doubles: " + add(5.5, 10.5));
        System.out.println("Addition of two strings: " + add("Hello, ", "World!"));
    }
}
