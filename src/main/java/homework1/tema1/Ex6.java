package homework1.tema1;
/*
6. Change the implementation of the calculator from the previous meeting to use only if-else instead of switch.

 */

import java.util.Scanner;

public class Ex6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter operation: ");
        String operatie = sc.next();

        if (operatie.equals("+")) {
            System.out.println("Sum: " + (n1 + n2));
        } else if (operatie.equals("-")) {
            System.out.println("Difference: " + (n1 - n2));
        }else if(operatie.equals("*")) {
            System.out.println("Multiplication: " + (n1 * n2));
        }else if(operatie.equals("/")) {
            System.out.println("Dividing: " + (n1 / n2));
        }else
            System.out.println("Unknown operation");

    }

}



