package co.com.mrsoft.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Samples of forEach
 */
public class Example6 {
    public static void main(String... args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        // Anonymous class definition
        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Item printed from anonymous class: " + s);
            }
        };

        // For each using anonymous Consumer instance
        strings.forEach(c1);

        // For each using lambda
        strings.forEach(s -> System.out.println("Item printed from lambda: " + s));
    }
}