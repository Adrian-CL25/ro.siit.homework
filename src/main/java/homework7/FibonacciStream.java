package homework7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        System.out.println(fibonacciStream());
    }

    //1. Write a method that can generate the first 100 numbers from Fibonacci series using Java 8 streams
// which returns the sequence as an array of int(BigInteger can fit all 100 Fobonacci numbers).
    private static List<BigInteger> fibonacciStream() {
        List<BigInteger> list = new ArrayList<>();

        Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
                p -> new BigInteger[]{p[1], p[0].add(p[1])})
                .limit(100)
                .forEach(p -> list.add(p[0]));

        return list;
    }

}

