package homework7.part2;

import lombok.Data;

import java.util.Objects;

@Data
public class Trader {
    private final String name;
    private final String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

}
