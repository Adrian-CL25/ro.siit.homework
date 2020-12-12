
package homework2.ex5;

import java.util.Scanner;

/***
 * @author Botezan Adrian
 */
public class Ex5 {



    public static boolean selectOddNumbers(int n) {
        /**
         * method who select the odd numbers
         */
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }




    public static void checkPrimeNumbers() {
        /**
         * method who check all prime numbers less than given number from input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int n = 2;


        while (n <= num) {
            if (selectOddNumbers(n)) {
                System.out.println("No." + i + " = " +n);
                i++;
            }
            n++;
        }
    }
}
