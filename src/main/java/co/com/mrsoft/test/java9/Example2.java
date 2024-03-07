package co.com.mrsoft.test.java9;

import java.util.*;

/**
 * Samples of Factory methods for Collection in Java 9.
 */
public class Example2 {
    public static void main(String[] args)
    {
        // Loading the list and set
        List<String> arrayList = Arrays.asList("A", "B", "C");
        Set<String> set = new HashSet<>(arrayList);

        // Loading the map
        Map<String, String> map = new HashMap<>();
        arrayList.forEach( i -> map.put(i + "-key", i + "-value") );

        // Syntax before Java 9 to create immutable collections
        List<String> oldUnmodifiableList = Collections.unmodifiableList(arrayList);
        Set<String> oldUnmodifiableSet = Collections.unmodifiableSet(set);
        Map<String, String> oldUnmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println(oldUnmodifiableList);
        System.out.println(oldUnmodifiableSet);
        System.out.println(oldUnmodifiableMap);

        // After Java 9 there is a static method of for List, Set, and Map.
        List<String> newUnmodifiableList = List.of("A", "B", "C");
        Set<String> newUnmodifiableSet = Set.of("A", "B", "C");
        Map<String, String> newUnmodifiableMap = Map.of("A-key", "A-value", "B-key", "B-value", "C-key", "C-value");
        System.out.println(newUnmodifiableList);
        System.out.println(newUnmodifiableSet);
        System.out.println(newUnmodifiableMap);
    }
}
