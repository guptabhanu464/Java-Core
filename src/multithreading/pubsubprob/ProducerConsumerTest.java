package multithreading.pubsubprob;

public class ProducerConsumerTest {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource(3);
        // Here we are using the same object for Producing and Consuming

        // Created Using Lamba Expression // Runnable Interface
        Thread producerThread = new Thread(()-> {

            for(int i = 0 ; i <= 6 ; i++) {
                try {
                    resource.produce(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Handle Exception Here
                }
            }
        });

        Thread consumerThread = new Thread(()-> {

            for(int i = 0 ; i <= 6 ; i++) {
                try {
                    Thread.sleep(5000);
                    resource.consume();
                } catch (InterruptedException e) {
                    // Handle Exception Here
                }
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
