package co.com.mrsoft.test.java14;

/**
 * Example of new instanceof expression.
 */
public class Example1 {
    public static void main(String[] args) {
        before14("jdk14");
        now14("jdk14");
    }

    private static void before14(Object obj) {
        if (obj instanceof String) {          // Instanceof
            String s = (String) obj;          // Cast and assignment

            if("jdk14".equalsIgnoreCase(s)){   // Validation
                System.out.println("JDK14 word!");
            }
        } else {
            System.out.println("not a string");
        }
    }

    private static void now14(Object obj) {
        if (obj instanceof String s) {         // Instanceof, cast, and assignment. Also known as pattern variable.
            if("jdk14".equalsIgnoreCase(s)){
                System.out.println("JDK14 word!");
            }
        } else {
            System.out.println("not a string");
        }
    }
}
