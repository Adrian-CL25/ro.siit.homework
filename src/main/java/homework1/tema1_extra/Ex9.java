package homework1.tema1_extra;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = {5, 8, 10, 11, 40, 50};
        boolean bool = false;
        for (int i = 0 ;i< arr.length;i++) {
            if (arr[i] == n) {
                System.out.println("Your number " + n + "  is in array at index " + i + ".");
                bool = true;
            }
        }
        if(!bool){ System.out.println("Your number in not in array!");}

    }
}
