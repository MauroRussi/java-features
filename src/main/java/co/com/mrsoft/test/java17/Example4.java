package co.com.mrsoft.test.java17;

/**
 * Examples of guarded patterns in new switch expression.
 */
public class Example4 {
    public static void main(String[] args) {
        testObject(null);
        testObject(11);
        testObject(8);
        testObject(12f);
        testObject(7f);
        testObject(13d);
        testObject(6d);
        testObject(11);
        testObject("hello!");
    }

    /**
     * Method that does null validation and guarded patterns as part of a switch expression.
     */
    private static void testObject(Object o) {

        switch (o) {
            // Null case
            case null -> System.out.println("Null received");
            // Integer case with condition
            case Integer i && i > 10 -> System.out.println("Integer greater than 10");
            case Integer i -> System.out.println("Integer less or equal than 10");
            // Float case with condition
            case Float f && f > 10 -> System.out.println("Float greater than 10");
            case Float f -> System.out.println("Float less or equal than 10");
            // Double case with condition
            case Double d && d > 10 -> System.out.println("Double greater than 10");
            case Double d -> System.out.println("Double less or equal than 10");
            // Default
            default -> System.out.println("Unknown type");
        }
    }
}
