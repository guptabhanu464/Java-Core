package multithreading;

public class ThreadLoc {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        threadLocalObj.set(Thread.currentThread().getName());

        Thread thread1 = new Thread(()->{

            try{
                Thread.sleep(5000);
            } catch (Exception e) {

            }
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println(threadLocalObj.get());
        });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadLocalObj.get());



    }
}
