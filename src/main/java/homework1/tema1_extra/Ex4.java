package homework1.tema1_extra;

import java.util.Scanner;

/*
4. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("It is positive!");
        }else {
            System.out.println("It is negativ!");
        }
    }
}
