package multithreading.locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    ReentrantLock lock = new ReentrantLock();

    public void produce() {
        try {
            lock.lock();
            System.out.println("Lock is acquired by " + Thread.currentThread().getName());
            Thread.sleep(3000);
        } catch (Exception e) {
            //HANDLE EXCEPTION
        } finally {
            lock.unlock();
            System.out.println("Lock is released " + Thread.currentThread().getName());
        }
    }
}
