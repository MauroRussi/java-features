package co.com.mrsoft.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Samples of Lambda Expressions.
 */
public class Example3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");

        // Implementation through Anonymous class of a Consumer function
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        // Lambda expression to shorten the code
        list.forEach(str -> System.out.println(str));
    }
}
