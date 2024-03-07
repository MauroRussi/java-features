package co.com.mrsoft.test.java9;

/**
 * @author mrussi
 * @version 0.1
 */
public class Example1 {
    /**
     * Sample deprecated method to show new enhancements.
     */
    @Deprecated(since = "1.1", forRemoval = true)
    public void testMethod() {
        System.out.println("Test deprecated");
    }

    /**
     * Default method to be run to print
     * <p>Hello world</p>
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
