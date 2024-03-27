package co.com.mrsoft.test.java16;

/**
 * Example of new instanceof expression.
 */
public class Example3 {
    public static void main(String[] args) {
        Object obj = "ABCDEF123456";

        // Instanceof, cast, and assignment. Also known as pattern variable.
        if (obj instanceof String s && s.length() > 10) {
            System.out.println("String length > 10");
        } else {
            System.out.println("Not a string");
        }
    }
}
