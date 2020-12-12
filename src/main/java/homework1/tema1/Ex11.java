package homework1.tema1;

import java.util.Scanner;

/*
11. Print the number of days specific to each month in year.
input: Month (string) of index of the month(1, 2, ... 12)
output: 31, 30, 28
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month do you want? ");
        String month = sc.next();
        int days =0;
        switch (month) {
            case "1": // January
            case "3": //  March
            case "5": //May
            case "7": // July
            case "8": // August
            case "10": // October
            case "12": // December
                days = 31;
                break;
            case "4": // April
            case "6": // June
            case "9": // September
            case "11": // November
                days = 30;
                break;
            case "2": // February
                days = 28;
                break;
        }

        System.out.println(days);
    }
}
