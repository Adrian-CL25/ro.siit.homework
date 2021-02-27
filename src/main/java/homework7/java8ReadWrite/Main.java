package homework7.java8ReadWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*By using streams and lamba expressions, implement a small application which:
1.load from a file a structure like
first name, last name, date of birth
2. write back another file containing only
first name, last name ordered alphabetically for all the of all matches which have the birthday on a month indicated.
Application takes 3 params:
1. input filename
2. target month (1-12)
3. output file name*/

public class Main {
    public static void main(String[] args) throws IOException {
        String fileLocation = "src\\main\\resources\\in.txt";
        String citire;

        List<Persoana> personList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileLocation));
            while ((citire = br.readLine()) != null) {
                Persoana person = Persoana.mapLineToPersoana(citire);
                personList.add(person);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


