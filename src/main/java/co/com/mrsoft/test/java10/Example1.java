package co.com.mrsoft.test.java10;

import java.util.List;

/**
 * Example of Local Variable Type Inference.
 */
public class Example1 {
    public static void main(String... args) {
        // inferred value ArrayList<String>
        var numbers = List.of(1, 2, 3, 4, 5);

        // Index of Enhanced For Loop
        for (var number : numbers) {
            System.out.println(number);
        }

        // Local variable declared in a loop
        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
