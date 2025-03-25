package multithreading;

public class Testthread {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()-> {
            for(int i = 0 ; i < 10 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle Exception Here
                }
                System.out.println("The current number is : " + i);
            }
        });
        t1.start();
        t1.join();
        System.out.println("Main thread is finished");
    }
}
