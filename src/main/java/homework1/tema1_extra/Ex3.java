package homework1.tema1_extra;

import java.util.Scanner;

/*
3. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int n1 = sc.nextInt();
        System.out.print("Input second number: ");
        int n2 = sc.nextInt();
        System.out.print("Input third number: ");
        int n3 = sc.nextInt();
        System.out.print("Input fourth number: ");
        int n4 = sc.nextInt();
        if( (n1 == n2)&&(n2 == n3)&&(n3 ==n4)){
            System.out.println("Numbers are equal!");

        }else {
            System.out.println("Numbers are not equal!");
        }

    }
}
