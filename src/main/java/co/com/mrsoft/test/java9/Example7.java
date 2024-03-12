package co.com.mrsoft.test.java9;

/**
 * Abstract class to handle any Object.
 */
abstract class Handler<T> {
    public T content;

    public Handler(T content) {
        this.content = content;
    }

    public abstract void handle();
}

/**
 * Sample of new diamond optional operator in inner classes.
 */
public class Example7 {
    public static void main(String[] args) {

        // Here we need to pass Type arguments in diamond operator
        // before Java 9 otherwise compiler will complain error
        Handler<Integer> intHandler = new Handler<Integer>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };

        intHandler.handle();

        // Here we do not need to pass Type arguments in diamond operator
        // as Java 9 compiler can infer the type automatically
        Handler<?> strHandler = new Handler<Object>("test") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };

        strHandler.handle();
    }
}
