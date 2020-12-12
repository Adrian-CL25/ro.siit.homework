/*
3. Write a Java method to find the duplicate characters in a string.
(Hint use str.toCharArray() to split the string into an array of characters)
 */
/**
 * Created by Adrian Botezan on 27.11.2020
 */
package homework2.duplicate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        Ex3Duplicate.findDuplicate(str, arr);
    }
}
