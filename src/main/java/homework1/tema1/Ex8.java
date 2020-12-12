package homework1.tema1;

import java.util.Scanner;

/*
8. Calculate and display the factorial of a given number n. (ex: 4! = 1*2*3*4)
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for( int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of ghiven number is: " + factorial);
    }
}
