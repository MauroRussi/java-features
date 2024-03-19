package co.com.mrsoft.test.java11;

import java.util.Optional;

/**
 * Example of new Optional APIs.
 */
public class Example9 {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = Integer.valueOf(10);

        // Optional.empty() - return an empty optional object
        Optional<Integer> empty = Optional.empty();

        // Optional.ofNullable(param) - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of(param) - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        // Optional.isEmpty - it returns true/false based on value being present or not.
        System.out.println("value of a: " + (a.isEmpty() ? "0" : a.get()));

        // Optional.isPresent - it returns true/false based on value being present or not.
        System.out.println("value of b: " +  (b.isPresent() ? b.get(): "0"));
        System.out.println("value of empty: " +  (empty.isPresent() ? empty.get(): "0"));
    }
}
