package concurrency.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BasicMutex {

    private int counter = 0;
    private final Lock locker = new ReentrantLock();

    //with lock
    public void incrementWithLock() {
        try {
            locker.lock();
            counter++;

        } finally {
            locker.unlock();
        }
    }

    //synchronized method
    public synchronized void incrementedWithInc() {
        counter++;
    }

    //synchronized code
    public void incrementedCodeLevel() {
        synchronized (this) {
            counter++;
        }
    }

    public int getCounter() {
        try {
            locker.lock();
            return counter;

        } finally {
            locker.unlock();
        }
    }
}
