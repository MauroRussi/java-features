package co.com.mrsoft.test.java12;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

/**
 * Example of new String APIs.
 */
public class Example2 {
    public static void main(String[] args) {
        String str = "I am\na multiline\nString.";
        String text = "Java";

        // String.indent() - Adjust the indention of each line of string based on argument passed.
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));

        // String.transform() - It applies an arbitrary function to a String and returns the function's return value
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        Integer num = "12345".transform(Integer::valueOf);
        System.out.println(transformed);
        System.out.println(num);

        // String.describeConstable() - It returns Optional Object containing description of String instance.
        Optional<String> optional = text.describeConstable();
        System.out.println(optional);

        // String.resolveConstantDesc() - Returns descriptor instance string of given string.
        String cDescription = text.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(cDescription);
    }
}
