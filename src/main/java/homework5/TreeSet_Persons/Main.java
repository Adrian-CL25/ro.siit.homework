package homework5.TreeSet_Persons;
/*
1. You need to store Persoane in a TreeSet.
 Define 2 Comparators (one for name - nume and one for age-varsta) that will be used when creating the TreeSet;

Add Persoane to the TreeSet; iterate throug the treeset and print the name and the age;
NOTE: if you are using a Comparator, the class Persoana should not implement Comparable anymore.
 */
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Persons pers1 = new Persons("Cristiano", 35);
        Persons pers2 = new Persons("Leo", 32);
        Persons pers3 = new Persons("Gerrard", 40);
        Persons pers4 = new Persons("Tatarusanu", 39);
        Persons pers5 = new Persons("Leo", 35);
        Persons pers6 = new Persons("Cristiano", 30);
        Persons pers7 = new Persons("Adriano", 35);
        Persons pers8 = new Persons("Adriano", 31);
        Persons pers9 = new Persons("Diego", 35);
        Persons pers10 = new Persons("Gerrard", 19);

        TreeSet<Persons> personsTreeSet = new TreeSet<>(new PersonsSortByNameAndAge());

//        TreeSet<Persons> personsTreeSet = new TreeSet<>(new PersonsSortByName());
//        TreeSet<Persons> personsTreeSet = new TreeSet<>(new PersonsSortByAge());

        personsTreeSet.add(pers1);
        personsTreeSet.add(pers2);
        personsTreeSet.add(pers3);
        personsTreeSet.add(pers4);
        personsTreeSet.add(pers5);
        personsTreeSet.add(pers6);
        personsTreeSet.add(pers7);
        personsTreeSet.add(pers8);
        personsTreeSet.add(pers9);
        personsTreeSet.add(pers10);

        System.out.println("Sort by name and age:\n");
        for (Persons eachPerson : personsTreeSet) {
            System.out.println(eachPerson.toString());
        }
        System.out.println("===========================");


    }
}
