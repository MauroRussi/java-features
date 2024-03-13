package co.com.mrsoft.test.java9.reactive;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

/**
 * The Processor works as Publisher extending the SubmissionPublisher class and as a Subscriber implementing Processor
 * and overriding the methods.
 * It receives a function which applies the transformation.
 */
public class TransformProcessor<T, R> extends SubmissionPublisher<R> implements Flow.Processor<T, R> {

    // It is a class that is used to control the flow of messages between Subscriber and the Publisher
    private Flow.Subscription subscription;
    // The function which performs the transformation.
    private final Function<T, R> function;

    /**
     * Constructor that receives the function.
     * @param function The function that has the transformation logic.
     */
    public TransformProcessor(Function<T, R> function) {
        super();
        this.function = function;
    }

    /**
     * This method is called before processing starts.
     * @param subscription a new subscription
     */
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    /**
     * This is called whenever the Publisher publishes a new message.
     * @param item the item
     */
    @Override
    public void onNext(T item) {
        submit(function.apply(item));
        subscription.request(1);
    }

    /**
     * This is called whenever some exception will be thrown in the processing,
     * @param e the exception
     */
    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }

    /**
     * This is called when the Publisher is closed
     */
    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}