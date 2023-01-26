package co.com.mrsoft.test.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8LambdaExample {
    public static void main(String... args) {
        //Old school
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("Old School - My Runnable");
            }};

        //Lambda function
        Runnable r1 = () -> {
            System.out.println("Lambda - My Runnable");
        };

        //Single statement lambda
        Runnable r2 = () -> System.out.println("Single statement lambda - My Runnable");

        //Another example
        List<Integer> numbers = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});

        //sum of all numbers
        sumWithCondition(numbers, n -> true);

        //sum of all even numbers
        sumWithCondition(numbers, i -> i % 2 == 0);

        //sum of all numbers greater than 5
        sumWithCondition(numbers, i -> i > 5);
    }

    public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
    }
}
