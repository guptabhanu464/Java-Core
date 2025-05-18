package multithreading.lockfreemechanism.atomicint;

import java.util.concurrent.atomic.AtomicInteger;

public class Resource {

    int counter; // Here we are not following cas operation

    AtomicInteger integer = new AtomicInteger(0); // Here we are using the CAS operation
    // CAS - Compare and Swap - Read the object , Compare with Object value and Expected Value and Change it with new value
    // Now If we have scenario of READ - MODIFY - UPDATE
    // We should go with Lock Free Mechanism


    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void increment1() {
        integer.incrementAndGet();
    }

    public int getCounter1() {
        return integer.get();
    }


}
