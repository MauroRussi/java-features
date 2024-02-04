package co.com.mrsoft.test.java8;

/**
 * Samples of:
 *      Default Methods in Interfaces
 *      Static Methods in Interfaces
 *      Functional Interface
 */
public class Example1 {
    public static void main(String... args) {
        //Anonymous class instantiation
        FunctionalInterface i1 = new FunctionalInterface() {
            @Override
            public void abstractMethod(int x, int y) {
                System.out.println("Anonymous abstract method: " + x + " - " + y);
            }
        };

        //Lambda definition on functional interface abstract method
        FunctionalInterface d1 = (x, y) -> System.out.println("Lambda abstract method: " + x + " - " + y);

        //Invocations
        i1.abstractMethod(1, 2);
        d1.abstractMethod(1, 2);

        //Default method invocation
        d1.defaultMethod();

        //Default static method invocation
        FunctionalInterface.defaultStaticMethod();
    }
}

interface FunctionalInterface {
    void abstractMethod(int x,int y);
    default void defaultMethod()
    {
        System.out.println("This is default method");
    }
    static void defaultStaticMethod()
    {
        System.out.println("This is static method");
    }
}