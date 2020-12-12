/*
9. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.

     Sample array: [20, 20, 30, 40, 50, 50, 50]

     After removing the duplicate elements the program should return [20, 30, 40, 50] as the array without duplicates.
 */
package homework2.ex9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int size = arr.length;
        Arrays.sort(arr);
        int[] temp = new int[size];
        int t = 0;
        int count = 1;
        for( int i = 0 ; i < size-1 ; i++){
            if(arr[i] != arr[i+1]){
                temp[t++] = arr[i];
                count++;
            }
        }
        temp[t] = arr[size-1];
        int[] newArray = Ex9.getInts(temp, count);

        Ex9.displayNewArray(newArray);
    }
}
