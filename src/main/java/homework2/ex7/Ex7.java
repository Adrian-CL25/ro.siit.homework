package homework2.ex7;
/*
7. Change the implementation of the calculator from the previous meeting to not stop after one calculation. (Hint: put switch inside a while loop)
 */

import java.util.Scanner;

public class Ex7 {


    public static void calculate(int n1, int n2, String operation) {
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
    }
}
