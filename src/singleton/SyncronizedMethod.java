package singleton;

public class SyncronizedMethod {

    private static SyncronizedMethod object;

    private SyncronizedMethod() {

    }

    // Here we have added the Syncronized Keyword
    // This is used when Multiple thread are using same method
    //
    public static synchronized SyncronizedMethod getInstance() {
        if(object == null) {
            object = new SyncronizedMethod();
        }

        return object;
    }
}
