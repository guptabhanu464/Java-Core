package collections.queue;

import java.util.PriorityQueue;

public class MinPriortityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> integers = new PriorityQueue<>(); // If we haven't provided any thing in priority queue constructor
        // Be default it is Min Heap or Min Priority Queue
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(6);
        integers.add(8);

        integers.forEach(System.out::println);
        int val = integers.peek();
        System.out.println(val);
    }
}
