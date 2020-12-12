package homework1.tema1;
/*
7. Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)
 */

import java.util.Scanner;

public class Ex7 {
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

            switch (operation) {
                case "+":
                    System.out.println("Sum: " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("Difference:" + (n1 - n2));
                    break;
                case "*":
                    System.out.println("Multiplication: " + (n1 * n2));
                    break;
                case "/":
                    System.out.println("Dividing: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Unknown operation!");
            }
            System.out.println("Do you want to contiune? True of false: ");
            bool = sc.nextBoolean();
        }
    }
}
