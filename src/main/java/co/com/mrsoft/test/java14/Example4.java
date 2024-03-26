package co.com.mrsoft.test.java14;

/**
 * Examples of switch expressions.
 */
public class Example4 {
    public static void main(String[] args) {
        System.out.println("Yield switch: " + yield_switch(5));
        System.out.println("New switch: " + arrow_switch(9));
    }

    private static String yield_switch(int number) {
        // Switch can be assigned directly to a variable or used as return value
        // Yield is used to return the specific value from the switch statement

        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }

    private static String arrow_switch(int number) {
        // Switch can be assigned directly to a variable or used as return value
        // No more break after case and you can include block statements after arrow ->
        return switch (number) {
            case 1, 2 -> "one or two";
            case 3 -> "three";
            case 4, 5, 6 -> "four or five or six";
            default -> "unknown";
        };
    }
}
