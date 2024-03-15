package co.com.mrsoft.test.java10;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Example of New APIs.
 */
public class Example2 {
    public static void main(String... args) {
        var ids = List.of(1, 3, 5, 7, 9);

        try {
            // Get an unmodifiable list
            List<Integer> copyOfIds = List.copyOf(ids);
            copyOfIds.add(6);
        } catch(UnsupportedOperationException e){
            System.out.println("Collection is not modifiable.");
        }

        try {
            // Get an unmodifiable list
            List<Integer> evenNumbers = ids.stream()
                                            .filter(i -> i % 2 == 0)
                                            .collect(Collectors.toUnmodifiableList());
            evenNumbers.add(6);
        } catch(UnsupportedOperationException e){
            System.out.println("Collection is not modifiable.");
        }

        try {
            // orElseThrow example
            Integer firstEven = ids.stream()
                    .filter(i -> i % 2 == 0)
                    .findFirst()
                    .orElseThrow();
            System.out.println("First even: " + firstEven);
        }
        catch (NoSuchElementException nEx) {
            System.out.println("No even numbers in the list.");
        }
    }
}
