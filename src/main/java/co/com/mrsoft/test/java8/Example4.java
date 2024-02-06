package co.com.mrsoft.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Samples of Method References.
 */
public class Example4 {
    private static void printStatic(String str) {
        System.out.println("Static: " + str);
    }

    private void printInstance(String str) {
        System.out.println("Instance: " + str);
    }

    public static void main(String[] args) {
        Example4 e = new Example4();
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        List<String> list = Arrays.asList("A", "B", "C");
        System.out.println("Method references: ");

        // Lambda expression and Method Reference on a static method
        list.forEach(x -> Example4.printStatic(x));
        list.forEach(Example4::printStatic);

        // Lambda expression and Method Reference on an instance method
        list.forEach(x -> e.printInstance(x));
        list.forEach(e::printInstance);

        // It applies the comparator on each item of the input array.
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        // Lambda expression and method reference to call default HashMap() constructor
        Supplier<Map> obj1 = () -> new HashMap();
        Supplier<Map> obj2 = HashMap::new;
    }
}
