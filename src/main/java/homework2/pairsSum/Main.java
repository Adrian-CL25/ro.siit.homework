/*
Write a Java method to find all pairs of elements in an array whose sum is equal to a given number.
 */

package homework2.pairsSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {2, 4, 3, 7, 3, 5, 11, 6};
        Ex4pairsSum.sumOfPairs(n, arr);


    }
}
