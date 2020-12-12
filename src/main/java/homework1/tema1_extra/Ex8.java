package homework1.tema1_extra;

import java.util.Scanner;

/*
8. Write a Java program to test if an array contains a specific value.
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = {5, 8, 10, 11, 40, 50};
        boolean bool = false;
        for (int i : arr) {
            if (i == n) {
                System.out.println("Your number " + n + "  is in array!");
                bool = true;
            }
        }
       if(!bool){ System.out.println("Your number in not in array!");}


    }
}
