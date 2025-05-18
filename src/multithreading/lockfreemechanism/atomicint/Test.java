package multithreading.lockfreemechanism.atomicint;

public class Test {

    public static void main(String[] args) {

        Resource resource = new Resource();
        Thread t1 = new Thread(()->{
            for(int i = 0 ; i < 400 ; i++) {
               // System.out.println("Thread is started " + Thread.currentThread().getName());
                resource.increment1();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0 ; i < 400 ; i++) {
              //  System.out.println("Thread is started " + Thread.currentThread().getName());
                resource.increment1();
            }
        });

       t1.start();
       t2.start();

//       try {
//           t1.join();
//           t2.join();
//       } catch (Exception e) {
//           System.out.println("Exception Caught");
//       }
        System.out.println("Main Thread is finished " + Thread.currentThread().getName());
        System.out.println(resource.getCounter1());
    }

}
