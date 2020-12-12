package homework2.ex11;

import java.util.Scanner;

/***
 * @author Adrian Botezan
 * Created on 27.11.2020
 */
public class Ex11 {


    public static int getDays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month do you want? ");
        String month = sc.next();
        int days =0;
        days = getDays(month, days);
        return days;
    }

    /***
     *
     * @param month is a string introduced by user with import java.util.Scanner
     * @param days number of days for each month
     * @return number of days for a specific month
     */
    public static int getDays(String month, int days) {
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
            /**
             * months are grouped by number of 31 days
             */
            case "4": // April
            case "6": // June
            case "9": // September
            case "11": // November
                days = 30;
                break;
            /**
             * months are grouped by number of 30 days
             */
            case "2": // February
                days = 28;
                break;
            /**
             * only February with 28 days.
             */
        }
        return days;
        /**
         * return number of days according with selected month
         */
    }
}
