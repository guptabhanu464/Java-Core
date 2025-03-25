package multithreading.pubsubprob;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> queue;
    private Integer bufferSize;

    public SharedResource(int bufferSize) {
        queue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {

        // If buffer is full , wait for the consumer to consume item
        while( queue.size() == bufferSize) {
            System.out.println("Buffer is full ,Producer waiting for the consumer");
            wait(); // Here we are waiting for consumer
        }

        queue.add(item);
        System.out.println("Produced : " + item);
        // Now notify is consumer if they for producer
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        // Queue is empty , waiting for producer to produce item
        while(queue.isEmpty()) {
            System.out.println("Queue is empty , waiting for Producer to produce item");
            wait();
        }

        int item = queue.poll();
        System.out.println("Consumed : " + item);
        notify();
        return item;



    }




}
