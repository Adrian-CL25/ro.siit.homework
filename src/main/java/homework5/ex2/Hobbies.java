package homework5.ex2;

import java.util.List;

public class Hobbies {
    private String name;
    private int frequency;
    private List<Adresa> adresaList;

    public Hobbies(String name, int frequency, List<Adresa> adresaList) {
        this.name = name;
        this.frequency = frequency;
        this.adresaList = adresaList;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adresa> getAdresaList() {
        return adresaList;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Name: ");
        builder.append(name);
        builder.append("Frequency: ");
        builder.append(frequency);
        builder.append("Adress list to practice: ");
        builder.append(adresaList);

        return "\n"+"Hobby:"+"'"+getName()+"'"+" "+"Frequency: "+getFrequency()+" times."+"Practice in: " + getAdresaList();
    }
}
