package co.com.mrsoft.test.java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Samples of try-with-resources improvements.
 */
public class Example6 {
    public static void main(String[] args) throws IOException {
        // Before Java 9 there was an intermediate variable declaration
        BufferedReader reader1 = new BufferedReader(new StringReader("message!!!"));

        try (BufferedReader reader2 = reader1) {
            System.out.println(reader2.readLine());
        }

        // After Java 9 there is not needed the variable declaration
        BufferedReader reader3 = new BufferedReader(new StringReader("message!!!"));

        try (reader3) {
            System.out.println(reader3.readLine());
        }
    }
}
