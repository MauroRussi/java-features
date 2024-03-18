package co.com.mrsoft.test.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example of Local-Variable syntax for Lambda parameters.
 */
public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        // Explicitly typed lambda expression
        String result1 = list.stream()
                        .map((String x) -> x.toUpperCase())
                        .collect(Collectors.joining(","));
        System.out.println(result1);

        // Implicitly typed lambda expression
        String result2 = list.stream()
                .map((x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result2);

        // Using var in Implicitly typed lambda expression
        String result3 = list.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result3);
    }
}
