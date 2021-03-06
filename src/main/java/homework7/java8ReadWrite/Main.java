package homework7.java8ReadWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
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
        String location = "src\\main\\resources\\in.txt";
//        Path p = Paths.get(location);

        String input;
        int targetMounth = 10;

        List<Persoana> personList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(location));
            while ((location = br.readLine()) != null && location.length() > 0) {
                Persoana person = Persoana.mapLineToPersoana(location);
                personList.add(person);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Persons list: ");
        System.out.println(personList.toString());


        System.out.println("Ordered alphabetically  birthday on a month equals 10.\n");

        String str = personList.stream()
                .filter(persoana -> persoana.getDateOfBirhday().getMonth().getValue() == targetMounth)
                .sorted(Comparator.comparing(persoana -> persoana.getFirstName()))
                .map(p -> p.getFirstName() + "," + p.getLastName() + " ")
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(str);

        File destination = new File("src/main/resources/out.txt");

        try (BufferedWriter scrie = new BufferedWriter(new FileWriter(destination))) {

            scrie.write(str +"\n");
            scrie.newLine();
                scrie.newLine();


//                writer.close();

        }

    }


}




