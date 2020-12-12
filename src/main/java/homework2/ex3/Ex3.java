package homework2.ex3;

import java.util.Scanner;


public class Ex3 {

    public static int maxDigit(){
        System.out.println("Enter a number from keyboard: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int rest;
        int max = 0;
        while( num != 0 ){
            rest =num %10;
            num = num/10;
            if( max < rest){
                max = rest;
            }
        }
        return max;
    }
}
