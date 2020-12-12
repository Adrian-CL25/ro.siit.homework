package homework1.tema1_extra;

import java.util.Scanner;

/*
5. Write a program in Java to input 5 numbers from keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth number: ");
        int d = sc.nextInt();
        System.out.print("Enter the last number: ");
        int e = sc.nextInt();


        int sum = a + b + c + d + e;
        int avg = sum / 5;
        System.out.println("The sum is: "+sum+ ", and the average is: "+ avg);
    }

}
