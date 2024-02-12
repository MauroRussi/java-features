package co.com.mrsoft.test.java8;

import java.util.Arrays;
import java.util.Optional;

/**
 * Samples of Optional
 */
public class Example8 {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;

        // Creates an optional from a null object
        Optional<Integer> opt1 = Optional.ofNullable(value1);

        // Creates an optional, if null throws NullPointerException
        Optional<Integer> opt2 = Optional.of(value2);

        // Checks if the value is null or not
        System.out.println("Is present: " + opt1.isPresent());

        // Returns the value that should be present
        System.out.println("Get: " + opt2.get());

        // Returns the value is present otherwise returns the default value
        System.out.println("Or Else: " + opt1.orElse(-1));
    }
}
