package homework5.TreeSet_Persons;

import java.util.Comparator;

public class PersonsSortByAge implements Comparator<Persons> {
    @Override
    public int compare(Persons o1, Persons o2) {
        int comparison;

        comparison = Integer.compare(o1.getAge(), o2.getAge());

        return comparison;
    }

}
