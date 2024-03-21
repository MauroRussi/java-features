package co.com.mrsoft.test.java12;

/**
 * Examples of switch expressions.
 */
public class Example1 {
    public static void main(String[] args) {
        System.out.println("Traditional switch: " + traditional_switch(5));
        System.out.println("Return switch: " + new_switch(9));
        System.out.println("New Syntax Return switch: ");
    }

    private static String traditional_switch(int number) {
        // Temporary variable to store the result calculated
        String result = "";

        // Inside each case it calculates and save the result in the temporary variable
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
                break;
        }

        return result;
    }

    private static String new_switch(int number) {
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
