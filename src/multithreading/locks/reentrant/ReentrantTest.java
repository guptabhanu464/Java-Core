package multithreading.locks.reentrant;

public class ReentrantTest {

    public static void main(String[] args) {

        SharedResource sharedResource1 = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();

        Thread thread1 = new Thread(sharedResource1::produce);

        Thread thread2 = new Thread(sharedResource2::produce);

        thread1.start();
        thread2.start();

    }

}
