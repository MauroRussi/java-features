package co.com.mrsoft.test.java17;

/**
 * Examples of pattern matching and null.
 */
public class Example3 {
    public static void main(String[] args) {
        old_testString("Java 16");  // Ok
        old_testString("Java 11");  // LTS
        old_testString("");         // Ok
        old_testString(null);       // Unknown!

        new_testString("Java 16");  // Ok
        new_testString("Java 11");  // LTS
        new_testString("");         // Ok
        new_testString(null);       // Unknown!
    }

    /**
     * Method that checks a null value with a traditional if and switch for rest of values.
     */
    private static void old_testString(String s) {
        if (s == null) {
            System.out.println("Unknown!");
            return;
        }

        switch (s) {
            case "Java 11", "Java 17"   -> System.out.println("LTS");
            default                     -> System.out.println("Ok");
        }
    }

    /**
     * Method that checks a null value as part of a switch expression.
     */
    private static void new_testString(String s) {
        switch (s) {
            case null                   -> System.out.println("Unknown!");
            case "Java 11", "Java 17"   -> System.out.println("LTS");
            default                     -> System.out.println("Ok");
        }
    }
}
