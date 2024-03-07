package co.com.mrsoft.test.java9;

/**
 * Samples of private static methods in interfaces.
 */
public class Example3 {
    public static void main(String[] args)
    {
        TestInterface testInterface = new TestInterface() {};
        testInterface.check();
    }
}

interface TestInterface {    
    private static String staticPrivate() {
        return "static private";
    }
    
    private String instancePrivate() {
        return "instance private";
    }
    
    default void check() {
        String result = staticPrivate();
        System.out.println("Call: " + result);

        TestInterface pvt = new TestInterface() {
            // anonymous class
        };

        result = pvt.instancePrivate();
        System.out.println("Call: " + result);
    }}
