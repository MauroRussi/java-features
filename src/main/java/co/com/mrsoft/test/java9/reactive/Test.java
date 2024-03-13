package co.com.mrsoft.test.java9.reactive;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

/**
 * Sample of Reactive Streams API
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        // List of items to process
        List<String> items = List.of("1", "2", "3", "4", "5");

        // Create End Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        // Create Processor
        TransformProcessor<String, Integer> transformProcessor = new TransformProcessor<>(Integer::parseInt);

        // Create End Subscriber
        Subscriber<Integer> subscriber = new Subscriber<>();

        // Create chain of publisher, processor and subscriber
        publisher.subscribe(transformProcessor); // publisher to processor
        transformProcessor.subscribe(subscriber); // processor to subscriber

        // Publish items
        System.out.println("Publishing Items to Subscriber");
        items.forEach(publisher::submit);

        // Logic to wait for messages processing to finish
        while (items.size() != subscriber.getCounter()) {
            Thread.sleep(10);
        }

        // Closing publishers
        publisher.close();
        transformProcessor.close();

        System.out.println("Exiting the app");
    }
}
