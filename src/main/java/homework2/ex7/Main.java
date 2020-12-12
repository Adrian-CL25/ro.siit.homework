package homework2.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean bool = true;
        while (bool) {
            System.out.println("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter second number:");
            int n2 = sc.nextInt();
            System.out.println("Enter operation: ");
            String operation = sc.next();
            Ex7.calculate(n1, n2, operation);
            bool = sc.nextBoolean();
        }
    }
}
