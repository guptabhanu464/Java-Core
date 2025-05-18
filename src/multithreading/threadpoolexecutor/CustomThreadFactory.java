package multithreading.threadpoolexecutor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("My Custom Thread");
        thread.setPriority(5); // By default
        thread.setDaemon(false);
        return thread;

    }
}
