package homework1.tema1;

import java.util.Scanner;

/*
3. Display the max digit from a number, read the number from keyboard.

 */
public class Ex3 {
    public static void main(String[] args) {
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
        System.out.println("Max digit from " + n+ " is: " + max);
    }
}
