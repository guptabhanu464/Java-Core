package multithreading;

public class Testthread {

    public void test() {

        System.out.println("Test Thread class is running");
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getState() + "234");
        Threading threading = new Threading();
        System.out.println(threading.getState());
        threading.start();
        System.out.println(threading.getState());
        System.out.println(Thread.currentThread().getState() + "234");
        Testthread testthread = new Testthread();
        testthread.test();
        threading.join();
    }
}
