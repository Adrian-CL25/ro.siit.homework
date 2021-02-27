package homework7.part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
/*

           1 Find all transactions in the year 2021 and sort them by value (small to high).
           2 What are all the unique cities where the traders work?
           3 Find all traders from Cambridge and sort them by name.
           4 Return a string of all traders names sorted alphabetically.
           5 Are any traders based in Milan?
           6 Print all transactions values from the traders living in Cambridge.
           7 Whats the highest value of all the transactions?
           8 Find the transaction with the smallest value.

     */
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Torino");
        Trader adi = new Trader("Adi", "Bucuresti");

        Transactions transaction1 = new Transactions(1000, 2022, raoul);
        Transactions transaction2 = new Transactions(1500, 2021, mario);
        Transactions transaction3 = new Transactions(100, 2020, alan);
        Transactions transaction4 = new Transactions(1200, 2021, raoul);
        Transactions transaction5 = new Transactions(1200, 2000, brian);
        Transactions transaction6 = new Transactions(1300, 2021, adi);


        Transactions[] transaction = {transaction1, transaction2, transaction3, transaction4, transaction5, transaction6};
        List<Trader> traderList;
        //1 Find all transactions in the year 2021 and sort them by value (small to high).
        System.out.println("Transaction on year 2021 \n");
        Stream.of(transaction)
                .filter(transactions -> transactions.getYear() == 2021)
                .sorted(Comparator.comparing(Transactions::getValue))
                .forEach(System.out::println);
        System.out.println("---------------------------------");


        //2 What are all the unique cities where the traders work?
        System.out.println("Unique cities where the traders work \n");
        traderList = Arrays.asList(raoul, alan, brian, adi, mario);
        List<Trader> uniqueCities = traderList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        uniqueCities.forEach(System.out::println);
        System.out.println("---------------------------------");


        // 3 Find all traders from Cambridge and sort them by name.
        System.out.println("Traders from Cambridge and sort them by name \n");
        Stream<Trader> s = Stream.of(raoul, alan, brian, adi, mario);
        s.filter(trader -> trader.getCity() == "Cambridge")
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("---------------------------------");


        // 4 Return a string of all traders names sorted alphabetically.
        System.out.println("Return a string of all traders names sorted alphabetically \n");
        String traderStr = traderList.stream()
                .map(p -> p.getName())
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        System.out.println("---------------------------------");


        //5 Are any traders based in Milan?
        System.out.println("Traders based in Milan? \n");
        traderList = Arrays.asList(raoul, alan, brian, adi, mario);
        boolean flag = traderList.stream()
                .anyMatch(elem -> elem.getCity().matches("Milan"));
        System.out.println(flag);
        System.out.println("---------------------------------");

        // 6 Print all transactions values from the traders living in Cambridge.
        System.out.println("Transactions values from the traders living in Cambridge \n");
        Stream.of(transaction)
                .filter(elem -> elem.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toList())
                .forEach(elem -> {
                    elem.getValue();
                    System.out.println(elem.getValue());
                });
        System.out.println("---------------------------------");

        // 7 Whats the highest value of all the transactions?
        System.out.println("The highest value of all the transactions \n");
        Integer maxim = Stream.of(transaction)
                .sorted(Comparator.comparing(Transactions::getValue))
                .mapToInt(Transactions::getValue)
                .max().getAsInt();
        System.out.println(maxim);
        System.out.println("---------------------------------");

        //8 Find the transaction with the smallest value.
        System.out.println("The transaction with the smallest value \n");
        Optional<Transactions> r =
                Stream.of(transaction)
                        .min(Comparator.comparing(Transactions::getValue));
        System.out.println(r);

        System.out.println("---------------------------------");

    }


}

