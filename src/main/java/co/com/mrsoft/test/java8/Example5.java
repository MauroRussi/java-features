package co.com.mrsoft.test.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Samples of Method References.
 */
public class Example5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //Filter with a predicate and Collectors that combine the result of the processing of the Stream
        List<String> c1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        Set<String> c2 = strings.parallelStream().filter(string -> string.contains("abc")).collect(Collectors.toSet());

        //If find any then return found otherwise return null
        String s1 = strings.stream().filter(string -> "abc".equals(string)).findAny().orElse(null);

        //Map does a transformation of the data to something else
        c1 = strings.parallelStream().map(String::toUpperCase).collect(Collectors.toList());

        //Sorted is used to sort the stream. This prints 10 random numbers in a sorted order
        (new Random()).ints().limit(10).sorted().forEach(System.out::println);

        //Statistics is a special Collector to calculate all statistics when stream processing is done
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
