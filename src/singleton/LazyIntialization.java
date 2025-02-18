package singleton;

public class LazyIntialization {

    private static LazyIntialization obj;

    private LazyIntialization() {
       // System.out.println("Lazy class intiated");
    }

    public static LazyIntialization getInstance() {
        if(obj == null) {
            obj = new LazyIntialization();
            System.out.println("Lazy Object created");
        }
        return obj;
    }

}
