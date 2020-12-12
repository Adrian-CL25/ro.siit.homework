package homework1.tema1_extra;

import java.util.Scanner;

/*
1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius

 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Input a degree in Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double fahr = sc.nextInt();
        double celsius = (fahr-32)*5/9;
        System.out.println(fahr + " degree Fahrenheit is equal to " + celsius + " Celsius.");


    }
}
