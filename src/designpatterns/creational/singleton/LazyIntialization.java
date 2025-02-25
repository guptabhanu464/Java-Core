package designpatterns.creational.singleton;

public class LazyIntialization {

    private static LazyIntialization obj;

    private LazyIntialization() {
       // System.out.println("Lazy class intiated");
    }

    // This will be created When someone will call the getInstance method
    public static LazyIntialization getInstance() {
        if(obj == null) {
            obj = new LazyIntialization();
            System.out.println("Lazy Object created");
        }
        return obj;
    }

}
