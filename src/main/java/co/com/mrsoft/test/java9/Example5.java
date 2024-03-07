package co.com.mrsoft.test.java9;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Samples of Stream API improvements.
 */
public class Example5 {
    public static void main(String[] args) {
        // Take while functionality
        System.out.print("Take while: ");
        Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty()).forEach(System.out::print);
        System.out.println("");

        // Drop while functionality
        System.out.print("Drop while (1): ");
        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty()).forEach(System.out::print);
        System.out.println("");
        System.out.print("Drop while (2): ");
        Stream.of("a","b","c","","e","","f").dropWhile(s-> !s.isEmpty()).forEach(System.out::print);
        System.out.println("");

        // Iterate until x is greater or equal to 10 and increment by 3 each iteration (kind of for loop)
        System.out.print("Iterate: ");
        IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::print);
        System.out.println("");

        // ofNullable avoids throwing a NullPointerException
        System.out.print("OfNullable: ");
        long count = Stream.ofNullable(100).count();
        System.out.print(count + " - ");
        count = Stream.ofNullable(null).count();
        System.out.println(count);
    }
}
