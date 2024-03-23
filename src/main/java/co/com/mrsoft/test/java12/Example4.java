package co.com.mrsoft.test.java12;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Examples of NumberFormat improvements.
 */
public class Example4 {
    public static void main(String[] args) {
        // Long format is the number with words: thousand / million
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(formatter.format(1000));
        System.out.println(formatter.format(1000000));

        // Short format is the number with a suffix: K / M.
        formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(formatter.format(1000));
        System.out.println(formatter.format(1000000));
    }
}
