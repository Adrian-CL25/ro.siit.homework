package homework7.part2;

import lombok.Data;

@Data
public class Transactions {

    private final int value;
    private final int year;
    private final Trader trader;

}
