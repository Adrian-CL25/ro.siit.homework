
/*
11. Print the number of days specific to each month in year.
input: Month (string) of index of the month(1, 2, ... 12)
output: 31, 30, 28
 */

package homework2.ex11;

import static homework2.ex11.Ex11.getDays;

public class Main {
    public static void main(String[] args) {
        int days = Ex11.getDays();
        System.out.println(days);
    }
}
