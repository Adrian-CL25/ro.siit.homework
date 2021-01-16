package homework5.TreeSet_Persons;

public class Persons {
    String name;
    int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person: " +
                "name:'" + name + '\'' +
                ", age=" + age;
    }

}
