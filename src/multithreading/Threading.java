package multithreading;

public class Threading extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My Threading Class Is Running");
    }
}
