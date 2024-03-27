package co.com.mrsoft.test.java16;

/**
 * Examples of Warnings for Value-Based Classes.
 */
public class Example1 {
    public static void main(String[] args) {
        Double d = 20.0;

        synchronized (d) { // Javac warning & HotSpot warning
            System.out.println("Synchronized block...");
        }
    }
}
