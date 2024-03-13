package co.com.mrsoft.test.java9.reactive;

import java.util.concurrent.Flow;

/**
 * The Subscriber consumes messages as they arrive - one at the time.
 */
public class Subscriber<T> implements Flow.Subscriber<T> {

    // It is a class that is used to control the flow of messages between Subscriber and the Publisher
    private Flow.Subscription subscription;
    private int counter = 0;

    /**
     * This method is called before processing starts.
     * @param subscription a new subscription
     */
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Subscribed");
        this.subscription = subscription;

        // This is a signal that the current Subscriber is ready to consume more messages.
        this.subscription.request(1);
        System.out.println("onSubscribe requested 1 item");
    }

    /**
     * This is called whenever the Publisher publishes a new message.
     * @param item the item
     */
    @Override
    public void onNext(T item) {
        System.out.println("Processing item " + item);
        counter++;

        // This is a signal that the current Subscriber is ready to consume more messages.
        this.subscription.request(1);
        System.out.println("onNext requested 1 item");
    }

    /**
     * This is called whenever some exception will be thrown in the processing,
     * @param e the exception
     */
    @Override
    public void onError(Throwable e) {
        System.out.println("Some error happened");
        e.printStackTrace();
    }

    /**
     * This is called when the Publisher is closed
     */
    @Override
    public void onComplete() {
        System.out.println("All Processing Done");
    }

    public int getCounter() {
        return counter;
    }
}
