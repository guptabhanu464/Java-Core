package singleton;

public class EagerIntialization {

    // Here we have created a singleton class
    // In this when the application is started , this class will be instiated and will get saved in the memory
    private static final EagerIntialization object = new EagerIntialization();

    // Made a private constructor without any parameter
    // So that no one can change the value externally
    private EagerIntialization() {
        System.out.println("Eager class intiated");

    }


    // If anyone want this object , they can get through this method
    public static EagerIntialization getInstance() {
        System.out.println("Eager Singleton Class object created");
        return object;
    }

}
