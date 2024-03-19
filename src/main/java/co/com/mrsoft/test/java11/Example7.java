package co.com.mrsoft.test.java11;

import java.util.Arrays;
import java.util.List;

/**
 * Example of Collection API updates
 */
public class Example7 {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Joe", "Julie");

        // Before Java 11
        String[] names1 = namesList.toArray(new String[namesList.size()]);
        System.out.println(names1.length);

        // New way
        String[] names2 = namesList.toArray(String[]::new);
        System.out.println(names2.length);
    }
}
