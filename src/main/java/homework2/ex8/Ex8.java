package homework2.ex8;

import java.util.Scanner;


public class Ex8 {

    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for( int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
