package homework1.tema1;

import java.util.Scanner;

public class Ex4 {
    /*
    4. Check if a number is palindrom ( e.g palindrom 1221, 34143), read the number from keyboard.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check if is palindrom or not: ");
        int num = sc.nextInt();
        int invers = 0;
        int rest;
        int compare = num;


        while (num != 0) {
            rest = num % 10;
            invers = invers * 10 + rest;
            num = num / 10;

        }
        if (compare == invers) {
            System.out.println("Number is palindrom!!");
        } else {
            System.out.println("Number is not palindrom");
        }

    }
}
