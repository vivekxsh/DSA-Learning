package OOPS;

class Student {
    String name;
    int rollNo;

    Student() {
        System.out.println("I am initial constructor");
    }

    Student(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);

        System.out.println(s1.getClass());

    }
}
