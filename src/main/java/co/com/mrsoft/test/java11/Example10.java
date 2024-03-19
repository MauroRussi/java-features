package co.com.mrsoft.test.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Example of new Predicate APIs.
 */
public class Example10 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "\n", "HTML", " ");

        // Predicate.not() - it negates the predicate.
        List<String> strings = stringList.stream()
                            .filter(Predicate.not(String::isBlank))
                            .collect(Collectors.toList());

        strings.forEach(str -> System.out.println(str));
    }
}
