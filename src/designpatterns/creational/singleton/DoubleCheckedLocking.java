package designpatterns.creational.singleton;

public class DoubleCheckedLocking {

    private static DoubleCheckedLocking object;

    private DoubleCheckedLocking() {

    }

    // This is used to solve the problem which happens in Syncronized Method
    // Here intially we check weather object is null
    // After that the syncronized keyword is also used
    // Syncronized - It is used to control access to shared resources by multiple threads
    public static DoubleCheckedLocking getInstance() {
        if(object == null) { // One time check
            synchronized (DoubleCheckedLocking.class) {
                if(object == null) { // 2nd Time checking
                    object = new DoubleCheckedLocking();
                }
            }
        }

        return object;
    }

}
