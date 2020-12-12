package homework1.tema1_extra;

import java.util.Arrays;
import java.util.Scanner;

/*

10. Write a Java program to remove a specific element from an array.
 */
public class Ex10 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 77, 50, 21, 50};
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Which index do you want to remove?");
        int removeIndex = sc.nextInt();

        for( int i = removeIndex ; i < size-1; i++){
            arr[i] = arr[i+1];
            }
        System.out.println(Arrays.toString(arr));
    }

}
