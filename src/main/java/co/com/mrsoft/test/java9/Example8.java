package co.com.mrsoft.test.java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Samples of Optional::stream filtering non-empty values from an Optional list.
 */
public class Example8 {
    public static void main(String[] args) {
        List<Optional<String>> listOptional = List.of(Optional.of("A"), Optional.empty(), Optional.of("C"),
                                      Optional.empty(), Optional.of("E"), Optional.empty());
        System.out.println("Optionals: " + listOptional);

        // Before Java 9 - Using filter()
        List<String> listStringFilter = listOptional.stream()
                                            .filter(Optional::isPresent)
                                            .map(Optional::get)
                                            .collect(Collectors.toList());
        System.out.println("Filter: " + listStringFilter);

        // Before Java 9 - Using flatMap()
        List<String> listStringFlatMap = listOptional.stream()
                                            .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
                                            .collect(Collectors.toList());
        System.out.println("FlatMap: " + listStringFlatMap);

        // Java 9 - Using flatMap() and Optional::stream
        List<String> listStringStream = listOptional.stream()
                                            .flatMap(Optional::stream)
                                            .collect(Collectors.toList());
        System.out.println("FlatMap and Stream: " + listStringStream);
    }
}
