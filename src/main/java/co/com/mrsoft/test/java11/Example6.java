package co.com.mrsoft.test.java11;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of String API updates
 */
public class Example6 {
    public static void main(String[] args) {
        String sample = " abc ";

        // Repeats a string given number of times. Returns the concatenated string.
        System.out.println(sample.repeat(2)); // " abc  abc "

        // Checks if a string is empty or have white spaces only.
        System.out.println(sample.isBlank()); // false
        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true

        // Removes the leading and trailing whitespaces.
        System.out.println(sample.strip()); // "abc"

        // Removes the leading whitespaces.
        System.out.println(sample.stripLeading()); // "abc "

        // Removes the trailing whitespaces.
        System.out.println(sample.stripTrailing()); // " abc"

        sample = "This\nis\na\nmultiline\ntext.";

        List<String> lines = new ArrayList<>();

        // Return the stream of lines of multi-line string.
        sample.lines().forEach(line -> lines.add(line));

        lines.forEach(line -> System.out.println(line));
    }
}
