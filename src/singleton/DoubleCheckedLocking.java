package singleton;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking object;

    private DoubleCheckedLocking() {

    }

    // This is used to solve the problem which happens in Syncronized Method
    // Here intially we check weather object is null
    // After that the syncronized keyword is also used
    // Syncronized - It is used to control access to shared resources by multiple threads
    public static DoubleCheckedLocking getInstance() {
        if(object == null) {
            synchronized (DoubleCheckedLocking.class) {
                if(object == null) {
                    object = new DoubleCheckedLocking();
                }
            }
        }

        return object;
    }

}
