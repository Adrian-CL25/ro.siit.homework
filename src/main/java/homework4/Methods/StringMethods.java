package homework4.Methods;


import java.util.Arrays;
import java.util.HashSet;

public class StringMethods {


    public static void main(String[] args) {
        String str = "avajava";
        System.out.println(StringMethods.reverse(str));
        System.out.println(StringMethods.printDuplicateCh(str));
        System.out.println(StringMethods.anagram(str));
        System.out.println(StringMethods.permutationOfString(str));
        System.out.println(StringMethods.containsOnlyDigits(str));
        System.out.println(StringMethods.noOfVowelsAndConsonants(str));
        System.out.println((StringMethods.occurrence(str)));
        System.out.println(StringMethods.nonRepeatCh(str));
        System.out.println(StringMethods.convertToInt(str));
        System.out.println(StringMethods.reverseTheWords(str));
        System.out.println(StringMethods.rotation(str));
        System.out.println(StringMethods.longestSubstring(str));
        System.out.println(StringMethods.longestPalindromicSubstring(str));
        System.out.println(StringMethods.removeDuplicate(str));
        System.out.println(StringMethods.removeSpecificaCharacter(str));

    }

    private static String reverse(String str) {   //method to reverse a given string.
        String lower = str.toLowerCase();
        String rev = "";
        for (int i = lower.length(); i > 0; --i) {
            rev = rev + (lower.charAt(i - 1));
        }
        return "Reverse string:" + rev;
    }

    private static String printDuplicateCh(String str) {//Method to print duplicate characters from a string.
        String lower = str.toLowerCase();
        String characters = "";
        String duplicate = "";
        for (int i = 0; i < lower.length(); i++) {
            String current = Character.toString(lower.charAt(i));
            if (characters.contains(current)) {
                if (!duplicate.contains(current))
                    duplicate += current;
            }
            characters += current;
        }
        return "Duplicate charactes are:" + duplicate;
    }

    private static boolean anagram(String str) { //Method to check if two strings are anagrams of each other.
        String strTest = "java";
        String str1 = strTest.toLowerCase();
        String lower = str.toLowerCase();

        while (str1.length() == lower.length()) {
            char[] c1 = str1.toCharArray();
            char[] c2 = lower.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                return true;
            }
        }
        return false;
    }

    private static int permutationOfString(String str) { //Method to find all the permutations of a string
        int fac = 1;
        for (int i = 1; i <= str.length(); i++) {
            fac = fac * i;
        }
        return fac;
    }

    private static boolean containsOnlyDigits(String str) { //Method to check if a string contains only digits.
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String noOfVowelsAndConsonants(String str) { //Method to count a number of vowels and consonants in a given string.
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowels++;
            else
                consonant++;
        }
        return "Vowels:" + vowels + "\t" + "Consonant:" + consonant;
    }

    private static String occurrence(String str) {
        char check = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == check) {
                count++;
            }
        }
        return "'a' occurrence:" + count;
    }


    private static String nonRepeatCh(String str) { //Method to print the first non-repeated character from a string.
        String lower = str.toLowerCase();
        char ch = 0;
        for (int i = 0; i < lower.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < lower.length(); j++) {
                if (i != j && lower.charAt(i) == lower.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                ch = lower.charAt(i);
                break;
            }
        }
        return "The first non repeated character in string is: " + ch;
    }


    private static int convertToInt(String str) {//Method to convert a given String into int like the Integer.parseInt().
        char[] ch = new char[str.length()];
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            n += Character.getNumericValue(ch[i]);
        }
        return n;


    }


    private static String reverseTheWords(String str) { //Method to reverse words in a given sentence without using any library method.
        String words[] = str.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        return "Reversed words : " + reversedString;
    }

    private static boolean rotation(String str) { //Method to check if two strings are a rotation of each other.
        String s2 = "javaava";
        if (str.length() != s2.length()) {
            return false;
        }
        String st3 = str + str;
        if (st3.contains(s2))
            return true;
        else
            return false;
    }

    private static String longestSubstring(String str) { //Method to find the length of the longest substring without repeating characters.
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while (j < str.length()) {
            if (!hashSet.contains(str.charAt(j))) {
                hashSet.add(str.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);

            } else {
                hashSet.remove(str.charAt(i));
                i++;
            }
        }
        return "Longest substring length: " + max;
    }


    private static String longestPalindromicSubstring(String str) { //Method to find the longest palindromic substring in str.
        int n = str.length();
        int maxLength = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                if (flag != 0 && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                }
            }
        }
        return "Longest palindromic substring:" + maxLength;

    }


    private static String removeDuplicate(String str) {//Write a method to remove the duplicate character from String.
        int index = 0;
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (s[i] == s[j]) {
                    break;
                }
            }
            if (j == i) {
                s[index++] = s[i];
            }
        }
        return "String without duplicate is: " + String.valueOf(Arrays.copyOf(s, index));
    }

    private static String removeSpecificaCharacter(String str) { //Method to remove a given character from String.
        char rem = 'a';
        String nou = "";
        char[] st = str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(st[i] != rem){
                nou = nou+st[i];
            }
        }
        return "String without char 'a' : " + nou;
    }
}



