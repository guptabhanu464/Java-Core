package generics;

public class Box<T> {
    // Here we have defined Generics at class level
    // Now Box can have any value - Integer , String , Double
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
