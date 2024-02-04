package co.com.mrsoft.test.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Samples of all default functions within Java 8.
 */
public class Example2 {
    /**
     * Sample of Function interface usage, which receives one value and returns another.
     * Interface: Function<T, R>
     * Signature: R apply(T t)
     * Examples: Arrays::asList, Integer::toBinaryString
     */
    private static void testFunction() {
        Map<String, Integer> nameMap = new HashMap<>();

        //Function declaration
        Function<String, Integer> function1 = s -> s.length();

        //Using function declaration reference
        Integer value1 = nameMap.computeIfAbsent("John", function1);
        System.out.println("Function declaration: " + value1);

        //Using implicit function through lambda
        Integer value2 = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println("Lambda function: " + value2);

        //Using method reference
        Integer value3 = nameMap.computeIfAbsent("John", String::length);
        System.out.println("Method reference: " + value3);

        //Composing functions
        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        System.out.println("Composing function: " + quoteIntToString.apply(5));
    }

    /**
     * Sample of BiFunction interface usage, which receives two arguments and returns another.
     * Interface: BiFunction<T, U, R>
     * Signature: R apply(T t, U u)
     */
    private static void testBiFunction() {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        //BiFunction declaration
        BiFunction<String, Integer, Integer> biFunction1 = (name, oldValue) -> name.equals("John") ? oldValue : oldValue + 1000;
        //Using BiFunction declaration reference
        salaries.replaceAll(biFunction1);
        //Using implicit BiFunction through lambda
        salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);
    }

    /**
     * The Supplier functional interface is a Function that does not take any arguments and returns a result.
     * This is typically used for lazy generation of values.
     * It's ideal for factories, builders, and so on.
     * Interface: Supplier<T>
     * Signature: T get()
     * Example: LocalDate::now, Instant::now
     */
    private static void testSupplier() {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //The function is to set up the lazy creation of the instance
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());

        //Get retries the information in the supplier, which is always the current date time
        LocalDateTime time = s.get();
        String time2 = s1.get();

        System.out.println("Supplier 1: " + time);
        System.out.println("Supplier 2: " + time2);
    }

    /**
     * The Consumer functional interface is a Function that accepts a generified argument and returns nothing.
     * It is a function that is representing side effects.
     * There are specialized versions such as: BiConsumer, DoubleConsumer, IntConsumer, and LongConsumer
     * Interface: Consumer<T>
     * Signature: void accept(T t)
     * Example: System.out::println, Error::printStackTrace
     */
    private static void testConsumer() {
        List<String> names = Arrays.asList("John", "Freddy", "Samuel");

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        //Functions that print the values received
        Consumer<String> c1 = (name) -> System.out.println("Hello, " + name);
        BiConsumer<String, Integer> c2 = (name, age) -> System.out.println("Name: " + name + " - age: "+ age);

        //Receives the Consumers and internally it calls the accept method
        names.forEach(c1);
        ages.forEach(c2);
    }

    /**
     * It is a functional interface, which accepts an argument and returns a boolean.
     * Usually, it used to apply in a filter for a collection of objects.
     * There are also specialized versions such as: BiPredicate, DoublePredicate, IntPredicate, and LongPredicate
     * Interface: Predicate<T>
     * Signature: boolean test(T t)
     * Example: String::isEmpty, Character::isDigit
     */
    private static void testPredicates() {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        //Functions that evaluate the value received
        Predicate<String> p1 = (name) -> name.startsWith("A");
        BiPredicate<String, Integer> p2 = (text, length) -> text.length() == length;

        //Receives the predicates and calls the test method
        List<String> namesWithA = names.stream().filter(p1).collect(Collectors.toList());
        System.out.println("Predicate: " + namesWithA);

        boolean result = p2.test("abc123", 6);
        System.out.println("BiPredicate: " + result);

        boolean result2 = p2.test("abc123", 10);
        System.out.println("BiPredicate: " + result2);
    }

    /**
     * It takes one argument, and returns a result of the same type of its arguments.
     * One of its use cases in the Collections API is to replace all values in a list with some computed values of the same type
     * There are also specialized versions such as: BiPredicate, DoublePredicate, IntPredicate, and LongPredicate
     * Interface: UnaryOperator<T>
     * Signature: T apply(T t)
     * Example: String::toLowerCase, Math::tan
     */
    private static void testUnaryOperator() {
        List<String> names = Arrays.asList("bob", "josh", "megan");

        //Function that transform the value received
        UnaryOperator<String> u1 = name -> name.toUpperCase();

        //Replace calling the explicit function
        names.replaceAll(u1);
        System.out.println("Names: " + names);

        //Replace calling the method reference
        names.replaceAll(String::toLowerCase);
        System.out.println("Names: " + names);
    }

    /**
     * It takes two arguments of the same type and returns a result of the same type of its arguments.
     * Interface: BinaryOperator<T>
     * Signature: T apply(T t1, T t2)
     * Example: BigInteger::add, Math::pow
     */
    private static void testBinaryOperator() {
        List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);

        //Function that sum the values received
        BinaryOperator<Integer> b1 = (i1, i2) -> i1 + i2;

        //Receives the function and reduce the list
        int sum1 = values.stream().reduce(0, b1);
        System.out.println("Sum: " + sum1);
    }

    public static void main(String... args) {
        testFunction();
        testBiFunction();
        testSupplier();
        testConsumer();
        testPredicates();
        testUnaryOperator();
        testBinaryOperator();
    }
}
