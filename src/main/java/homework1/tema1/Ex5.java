package homework1.tema1;

import java.util.Scanner;

public class Ex5 {
    /*
    5. Display all the prime numbers lower than a given number, read the number from keyboard

     */

    public static boolean prim(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int n = 2;


        while (n <= num) {
            if (prim(n)) {
                System.out.println("No." + i + " = " +n);
                i++;
            }
            n++;
        }
    }
}
