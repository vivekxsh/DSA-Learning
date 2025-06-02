package flowchart;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period: ");
        double time = sc.nextDouble();

        double SI = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + SI);

        sc.close();

    }
}
