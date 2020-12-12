package homework1.tema1_extra;

import java.util.Scanner;

/*
6. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing"
if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();

        if(n1<n2 && n2<n3){
            System.out.println("Increasing order!");

        }else if(n1>n2 && n2>n3){
            System.out.println("Decrasing order!");
        }else{
            System.out.println("Neither increasing or decreasing order.");
        }
    }
}
