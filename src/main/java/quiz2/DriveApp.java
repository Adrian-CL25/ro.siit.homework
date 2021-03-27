package quiz2;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Log4j2

public class DriveApp {

    public static void main(String[] args) {

        String location = "src\\main\\resources\\delivery.txt";
        List<Package> packageList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(location));) {

            while ((location = br.readLine()) != null && location.length() > 0) {
                Package p = Package.mapLineToPackage(location);
                packageList.add(p);

            }
        } catch (IOException e) {
            log.error(e);
        }


        List<Package> groupPackage = packageList.stream()
                .filter(elem -> elem.getLocation().matches(elem.getLocation()))
                .sorted(Comparator.comparing(Package::getDate))
                .collect(Collectors.toList());


        Map<List<String>, List<Package>> group = groupPackage.stream()
                .collect(Collectors.groupingBy(k -> new ArrayList<>(
                                Arrays.asList(k.getLocation(), k.getDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")))
                        )
                ));
        group
                .entrySet()
                .stream()
                .forEach(x -> {
                    System.out.println(x.getKey());
                    x.getValue().stream()
                            .forEach(p -> System.out.printf(" ( %2s %-10s %-10d )%n", p.getLocation(), p.getDistance(), p.getValue(), p.getDate()));
                    int groupValue = x.getValue().stream().mapToInt(Package::getValue).sum();
                    System.out.println("Group value: " + groupValue);
                    int revenue = x.getValue().stream().mapToInt(Package::getDistance).sum();
                    int totalRevenue = revenue * 1;
                    System.out.println("Revenue by group = " + totalRevenue + " Lei ");

                    long count = x.getValue()
                            .stream()
                            .mapToInt(Package::getDistance)
                            .count();
                    long distance = x.getValue()
                            .stream()
                            .mapToInt(Package::getDistance)
                            .sum() / count;
                    int d = (int) (distance*100); //am pus timp mai mic
                    startThreads(x,d,distance);


                });


        int sum = packageList.stream().mapToInt(Package::getValue).sum();
        int totalGain = packageList.stream().mapToInt(Package::getDistance).sum();
        System.out.println("Total value of all delivered packages: " + sum);
        System.out.println("Total value of the revenue computed for all groups delivered: " + totalGain + " Lei");




    }

    private static void startThreads(Map.Entry<List<String>, List<Package>> x, int d,long distance) {
        Delivery f = new Delivery(x.getKey().get(0), x.getKey().get(1), d);
        Thread delv = new Thread(f);
        delv.start();
        try {
            Thread.sleep(d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("[Delivering for <"+ x.getKey().get(0)+"> and date <"+ x.getKey().get(1)+"> in <"+ distance +"> seconds]");
        System.out.println("--------------------------------------------------\n");
    }

}

