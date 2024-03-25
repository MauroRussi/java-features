package co.com.mrsoft.test.java14;

import java.util.Locale;

/**
 * Example of Helpful NullPointerException.
 */
public class Example2 {
    public static void main(String[] args) {
        String input = null;

        // NullPointerException
        String result = showUpperCase(input);
        System.out.println(result);
    }

    private static String showUpperCase(String str){
        return str.toUpperCase(Locale.US);
    }
}
