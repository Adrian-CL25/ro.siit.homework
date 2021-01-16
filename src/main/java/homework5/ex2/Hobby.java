package homework5.ex2;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String title;
    private int frequency;
    List<Adresa> adress = new ArrayList<>();



    public Hobby(String title, int frequency) {
        this.title = title;
        this.frequency = frequency;
    }

    public static List<Hobby> allHobbies = new ArrayList<>();

    static {
        allHobbies.add(new Hobby("Dance", 12));
        allHobbies.add(new Hobby("Swimming", 5));
        allHobbies.add(new Hobby("Cycling", 3));
        allHobbies.add(new Hobby("Skiing", 2));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequencyl) {
        this.frequency = frequency;
    }
}



