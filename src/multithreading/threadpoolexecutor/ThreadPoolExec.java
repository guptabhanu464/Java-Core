package multithreading.threadpoolexecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExec {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(20,100,5, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10), new CustomThreadFactory() , new CustomRejectionHandler());

        for(int i = 1 ; i <= 111 ; i++) {
            int finalI = i;
            executor.submit(()-> {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    //Handle Exception
                }
                System.out.println("My Thread Pool Executor is running with Thread name " + Thread.currentThread().getName() + " "
                        + finalI);

            });

        }
        executor.shutdown();
    }
}
