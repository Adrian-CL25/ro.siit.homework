package homework5.TreeSet_Persons;

import java.util.Comparator;

public class PersonsSortByName implements Comparator<Persons> {
    @Override
    public int compare(Persons o1, Persons o2) {
        int comparison;
        comparison = o1.getName().compareTo(o2.getName());
        return comparison;
    }


}
