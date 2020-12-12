package homework2.ex4;

import java.util.Scanner;

public class Ex4 {

    public static boolean checkPalindrom() {
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
        return compare == invers;
    }
}
