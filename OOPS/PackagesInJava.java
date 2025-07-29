package OOPS;

/*Here we have imported java.util.Scanner
 * import -> it is a predefined keyword in java to import classes and objects into current program folder.
 * java -> The root package that contains standard Java classes.
 * util -> util is an inbuilt sub-package of java which contains some number of classes in itself.
 * Scanner -> Scanner is a class of java.util package which is already written in java program to get input from user(i,e. from keyboard).
 */
import java.util.Scanner;

public class PackagesInJava {

    public static void main(String[] args) {

        /*
         * Scanner -> it is a class helpful for making object.
         * sc -> class objext name
         * new -> inbuilt key to alocate space in heap memory
         * System.in -> a constructor argument
         */
        Scanner sc = new Scanner(System.in);

        /*
         * int -> data type of variable n
         * sc -> object name
         * nextInt() -> a method inside Scanner class
         */
        int n = sc.nextInt();

        System.out.println(n);

        // close() -> a method of Scanner class to close the Scanner class
        sc.close();

    }
}
