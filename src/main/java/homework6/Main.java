package homework6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static homework6.Skier.mapLineToSkier;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileLocation = "C:\\Users\\Adrian\\Desktop\\JAVA\\ro.siit.homework\\src\\main\\resources\\ski.txt";
        Path path = Paths.get(fileLocation);
        List<Skier> playerList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileLocation));
            while ((fileLocation = br.readLine()) != null) {
                Skier skier = mapLineToSkier(fileLocation);
                playerList.add(skier);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Skier> skiersList = Files.lines(path)
                .map(line -> mapLineToSkier(line))
//                .peek(System.out::println)
                .collect(Collectors.toList());

        skiersList.forEach(skier -> skier.applyPenalties(skier));
        skiersList.sort(Comparator.comparing(skier -> skier.getResult()));
        System.out.println(skiersList);


    }


}



