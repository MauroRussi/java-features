package co.com.mrsoft.test.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Examples of Collectors new APIs.
 */
public class Example5 {
    public static void main(String[] args) {
        // Using teeing collectors to get the average of n numbers: sum the numbers / total items
        double mean = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(
                                  // Downstream1 sum of numbers
                Collectors.teeing(Collectors.summingDouble(i -> i),
                                  // Downstream2 count of numbers
                                 Collectors.counting(),
                                  // Pass the output of downstream1 and downstream2 to the merger BiFunction
                                 (sum, count) -> sum / count));
        System.out.println("Mean: " + mean);
    }
}
