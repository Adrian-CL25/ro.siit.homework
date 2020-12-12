package homework1.tema1_extra;

import java.util.Scanner;

/*
2. Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Input a value for inch: ");
        Scanner sc = new Scanner(System.in);
        double inch = sc.nextInt();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters.");


    }
}
