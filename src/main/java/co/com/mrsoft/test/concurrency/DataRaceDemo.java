package co.com.mrsoft.test.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Class which has a shared variable that is incremented concurrently without any lock.
 */
class WorkerNoLock implements Runnable {
    static int sharedCount = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            sharedCount++;
        }
    }
}

/**
 * Class which has a shared variable that is incremented concurrently with a lock.
 */
class WorkerLock implements Runnable {
    static int sharedCount = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            lock.lock();
            sharedCount++;
            lock.unlock();
        }
    }
}

/**
 * Class which has an atomic shared variable that is incremented concurrently.
 */
class WorkerAtomicVar implements Runnable {
    static AtomicInteger sharedCount = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            sharedCount.incrementAndGet();
        }
    }
}

/**
 * Class which has a shared variable that is incremented concurrently in a synchronized section using the class
 * intrinsic lock.
 */
class WorkerSynchronized implements Runnable {
    static int sharedCount = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            synchronized (WorkerSynchronized.class) {
                sharedCount++;
            }
        }
    }
}

public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        demoNoLock();
        demoLock();
        demoAtomicVar();
        demoSynchronized();
    }

    /**
     * This is a demo of data race without any control.
     * @throws InterruptedException
     */
    private static void demoNoLock() throws InterruptedException {
        Thread th1 = new Thread(new WorkerNoLock());
        Thread th2 = new Thread(new WorkerNoLock());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("DemoNoLock - Value of the counter " + WorkerNoLock.sharedCount);
    }

    /**
     * This is a demo of data race with a lock concurrency control.
     * @throws InterruptedException
     */
    private static void demoLock() throws InterruptedException {
        Thread th1 = new Thread(new WorkerLock());
        Thread th2 = new Thread(new WorkerLock());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("DemoLock - Value of the counter " + WorkerLock.sharedCount);
    }

    /**
     * This is a demo of data race with an atomic var concurrency control.
     * @throws InterruptedException
     */
    private static void demoAtomicVar() throws InterruptedException {
        Thread th1 = new Thread(new WorkerAtomicVar());
        Thread th2 = new Thread(new WorkerAtomicVar());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("Atomicvar - Value of the counter " + WorkerAtomicVar.sharedCount);
    }

    /**
     * This is a demo of data race with a synchronized section concurrency control.
     * @throws InterruptedException
     */
    private static void demoSynchronized() throws InterruptedException {
        Thread th1 = new Thread(new WorkerSynchronized());
        Thread th2 = new Thread(new WorkerSynchronized());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("Synchronized - Value of the counter " + WorkerSynchronized.sharedCount);
    }
}